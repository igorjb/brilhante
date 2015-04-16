package br.com.devmedia.controle;

import java.io.Serializable;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.devmedia.beans.Setor;
import br.com.devmedia.modelo.DAOSetor;
import br.com.devmedia.util.UtilRelatorios;

@SuppressWarnings("serial")
@ManagedBean(name="controleSetor")
@SessionScoped
public class ControleSetor implements Serializable{

	private DAOSetor<Setor> dao;
	private Setor objeto;
	
	public ControleSetor() {
		dao = new DAOSetor<Setor>();
	}

	public String listar() {
		return "/privado/setor/listar?faces-redirect=true";
	}
	
	public String novo() {
		objeto = new Setor();
		return "form";
	}
	
	public String cancelar() {
		return "listar";
	}
	
	public String gravar() {
		boolean gravou = false;
		if (objeto.getId() == null) {
			gravou = dao.persist(objeto);
		} else {
			gravou = dao.merge(objeto);
		}
		
		if (gravou) {
			return "listar";
		} else {
			return "form";
		}
	}
	
	public String alterar(Setor obj) {
		objeto = obj;
		return "form";
	}
	
	public String excluir(Setor obj) {
		dao.remove(obj);
		return "listar";
	}
	
	public DAOSetor<Setor> getDao() {
		return dao;
	}

	public void setDao(DAOSetor<Setor> dao) {
		this.dao = dao;
	}

	public Setor getObjeto() {
		return objeto;
	}

	public void setObjeto(Setor objeto) {
		this.objeto = objeto;
	}
	
	public void relatorio() {
		HashMap parametros = new HashMap();
		UtilRelatorios.imprimeRelatorio("setores", parametros, dao.listarTodos());
	}

}
