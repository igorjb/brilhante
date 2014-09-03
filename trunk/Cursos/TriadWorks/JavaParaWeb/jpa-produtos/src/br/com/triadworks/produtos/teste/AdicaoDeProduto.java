package br.com.triadworks.produtos.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.triadworks.produtos.modelo.Produto;

public class AdicaoDeProduto {

	public static void main(String[] args) {
		
		Produto produto2 = new Produto();
		produto2.setNome("HD Externo Portátil");
		produto2.setDescricao("HD Externo Portátil 1TB M3 Portable - Preto - Samsung");
		produto2.setPreco(231.47);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-produtos");
		
		Produto produto3 = new Produto();
		produto3.setNome("Tablet Samsung Galaxy");
		produto3.setDescricao("Tablet Samsung Galaxy Tab 3 Lite T110N 8GB Wi-fi Tela TFT HD 7 Android 4.2 Processador Dual-core 1.2 GHz - Preto");
		produto3.setPreco(404.10);
		
		Produto produto4 = new Produto();
		produto4.setNome("iPhone Apple");
		produto4.setDescricao("iPhone Apple 4S Branco 8GB");
		produto4.setPreco(1098.89);
		
		Produto produto5 = new Produto();
		produto5.setNome("MacBook Pro Retina");
		produto5.setDescricao("MacBook Pro Retina ME293BZ com intel Core i7 15.4 8GB 256GB FLASH Apple");
		produto5.setPreco(8099.10);
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(produto2); // grava o novo produto no banco
		manager.persist(produto3); // grava o novo produto no banco
		manager.persist(produto4); // grava o novo produto no banco
		manager.persist(produto5); // grava o novo produto no banco
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println("Produtos adicionados com sucesso!");
	}
}
