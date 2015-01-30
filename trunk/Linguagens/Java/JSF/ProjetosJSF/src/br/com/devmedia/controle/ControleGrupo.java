package br.com.devmedia.controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.devmedia.beans.Grupo;
import br.com.devmedia.modelo.GrupoDAO;
import br.com.devmedia.util.UtilMensagens;

@ManagedBean(name="controleGrupo")
@SessionScoped
public class ControleGrupo implements Serializable{
	private GrupoDAO dao;
	private Grupo objeto;
	@ManagedProperty(value="#{controleLogin}")
	private ControleLogin controleLogin;
	
	public ControleGrupo() {
		dao = new GrupoDAO();
	}
	
	
	public ControleLogin getControleLogin() {
		return controleLogin;
	}


	public void setControleLogin(ControleLogin controleLogin) {
		this.controleLogin = controleLogin;
	}


	public GrupoDAO getDao() {
		return dao;
	}
	public void setDao(GrupoDAO dao) {
		this.dao = dao;
	}
	public Grupo getObjeto() {
		return objeto;
	}
	public void setObjeto(Grupo objeto) {
		this.objeto = objeto;
	}
	
	public String listar() {
		return "/privado/grupo/listar?faces-redirect=true";
	}
	
	public String novo() {
		objeto = new Grupo();
		return "form";
	}
	
	public String cancelar() {
		return "listar";
	}
	
	public String gravar() {
		if (dao.gravar(objeto)) {
			return "listar";
		} else {
			return "form";
		}
	}
	
	public String alterar(Grupo obj) {
		objeto = obj;
		return "form";
	}
	
	public String excluir(Grupo obj) {
		if (controleLogin.getUsuarioLogado().getGrupo().getNome().equals("Administradores"))
		{
			dao.excluir(obj);
		} else {
			UtilMensagens.mensagemErro("Usuário não tem autorização para exclusao!!!!");
		}
		
		return "listar";
	}
}
