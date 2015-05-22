package br.com.devmedia.modelo;

import java.io.Serializable;

import br.com.devmedia.beans.Setor;
import br.com.devmedia.conversores.ConverterOrdem;
import br.com.devmedia.jpa.EntityManagerUtil;

@SuppressWarnings("serial")
public class DAOSetor<T> extends GenericDAO<T> implements Serializable {

	public DAOSetor() {
		super.setClasse(Setor.class);
		super.setEm(EntityManagerUtil.getEntityManager());
		super.getListaOrdem().add(new Ordem("C�digo", "id"));
		super.getListaOrdem().add(new Ordem("Nome", "nome"));
		super.setOrdemAtual((Ordem) super.getListaOrdem().get(1));
		super.setFiltro("");
		super.setMaximoObjetos(5);
		super.setConverterOrdem(new ConverterOrdem(super.getListaOrdem()));
	}

}
