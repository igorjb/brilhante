package br.gov.fortaleza.faturaweb.dao;

import java.io.Serializable;
import java.util.Date;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.gov.fortaleza.faturaweb.model.Cliente;
import br.gov.fortaleza.faturaweb.model.Moeda;

@Named
@Singleton
public class IniciadorDeBaseDeTeste implements Serializable{

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void iniciaEstadoDaBase() {
		Date hoje = new Date();
		
		Cliente brilhante = new Cliente("brilhante");
		em.persist(brilhante);
		em.persist(brilhante.iniciaFaturaParaFechamento(hoje));
		em.persist(brilhante.lanca("Saraiva", 80.0, Moeda.REAL));
		em.persist(brilhante.lanca("Sabor da Picanha", 150.0, Moeda.REAL));
		em.persist(brilhante.lanca("Hear Saloon", 35.20, Moeda.DOLAR));
		
		Cliente jossa = new Cliente("jossa");
		em.persist(jossa);
		em.persist(jossa.iniciaFaturaParaFechamento(hoje));
		em.persist(jossa.lanca("PSN", 20.0, Moeda.DOLAR));
		em.persist(jossa.lanca("FastShop", 2000.0, Moeda.REAL));
		em.persist(jossa.lanca("eBay", 77.6, Moeda.DOLAR));
	}

}
