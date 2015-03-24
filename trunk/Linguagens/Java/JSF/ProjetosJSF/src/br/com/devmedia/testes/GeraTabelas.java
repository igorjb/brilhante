package br.com.devmedia.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {

	public static void main(String[] args) {
		 EntityManagerFactory factory = Persistence.
		          createEntityManagerFactory("ProjetosJSF");

		factory.close();

	}

}
