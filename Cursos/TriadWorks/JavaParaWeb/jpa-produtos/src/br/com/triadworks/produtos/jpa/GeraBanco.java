package br.com.triadworks.produtos.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraBanco {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-produtos");
		factory.close();
	}
}
