package br.com.triadworks.produtos.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.triadworks.produtos.modelo.Produto;

public class CarregaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-produtos");
		EntityManager manager = factory.createEntityManager();
		
		Produto produto = manager.find(Produto.class, 1);
		
		System.out.println("Produto encontrado: " + produto.getNome());

	}

}
