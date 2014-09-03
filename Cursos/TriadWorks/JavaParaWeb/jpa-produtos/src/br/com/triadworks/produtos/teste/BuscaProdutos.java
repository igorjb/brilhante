package br.com.triadworks.produtos.teste;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.triadworks.produtos.modelo.Produto;

import java.util.List;

public class BuscaProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-produtos");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select p from Produto p where p.preco > :preco");
		query.setParameter("preco", 99.99);
		
		@SuppressWarnings("unchecked")
		List<Produto> produtos = query.getResultList();
		
		for (Produto produto : produtos)
		{
			System.out.println("Produto: " + produto.getNome());
		}
		
		manager.close();
	}

}
