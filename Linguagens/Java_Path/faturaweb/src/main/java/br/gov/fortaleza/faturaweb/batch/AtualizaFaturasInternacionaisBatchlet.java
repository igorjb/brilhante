package br.gov.fortaleza.faturaweb.batch;

import java.util.List;

import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.gov.fortaleza.faturaweb.model.Lancamento;
import br.gov.fortaleza.faturaweb.model.Moeda;

@Dependent
@Named("AtualizaFaturasInternacionaisBatchlet")
public class AtualizaFaturasInternacionaisBatchlet implements Batchlet{
	
	@PersistenceContext
	private EntityManager em;
	
	//Constante que simboliza o valor do dólar no fim do mês
	//No mundo real recuperariamos esse valor de uma forma dinâmica
	private Double VALOR_DOLAR = 2.4;
	
	@Override @Transactional
	public String process() throws Exception{
		String query = "SELECT l FROM Lancamento l WHERE l.moeda = :moeda";
		Query q = em.createQuery(query).setParameter("moeda", Moeda.DOLAR);
		List<Lancamento> lista = q.getResultList();
		
		for (Lancamento lancamento : lista) {
			lancamento.converteParaReal(VALOR_DOLAR);
		}
		
		return "COMPLETED";
	}
	
	@Override
	public void stop() throws Exception{
		
	}
	
}
