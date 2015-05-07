package br.com.devmedia.testes;

import javax.persistence.EntityManager;

import br.com.devmedia.beans.Grupo;
import br.com.devmedia.jpa.EntityManagerUtil;

public class TesteInserirGrupo {

	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getEntityManager();
		Grupo g = new Grupo();
		g.setNome("Administradores");
		em.getTransaction().begin();
		em.persist(g);
		em.getTransaction().commit();
	}
}