package br.gov.fortaleza.faturaweb.batch;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.batch.api.chunk.ItemReader;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.context.JobContext;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.gov.fortaleza.faturaweb.model.Lancamento;

@Dependent
@Named("GeraFaturasReader")
public class GeraFaturasReader implements ItemReader
{
	@PersistenceContext
	private EntityManager em;
	private Iterator<Lancamento> iterator;
	
	@Inject
	private JobContext contextoBatch;
	
	private Integer indiceLido;
	
	@Override
	public void open(Serializable ckpt) throws Exception{
		Date hoje = new Date();
		indiceLido = (Integer) ckpt;
		
		if (indiceLido == null){
			indiceLido = 0;
		}
		
		String query = "select l from Lancamento l "
				+ "where l.cliente.id = :clienteId and l.data between :inicio and :fim";
		Query q = em.createQuery(query);
		q.setParameter("clienteId", getClienteId());
		q.setParameter("inicio", umMesAtras());
		q.setParameter("fim", hoje);
		q.setFirstResult(indiceLido);
		List<Lancamento> lancamentosDoMes = q.getResultList();
		iterator = lancamentosDoMes.iterator();
	}
	
	private Date umMesAtras() {
		Calendar hojeCal = Calendar.getInstance();
		hojeCal.add(Calendar.MONTH, -1);
		return hojeCal.getTime();
	}
	
	private Long getClienteId() {
		JobOperator jobOperator = BatchRuntime.getJobOperator();
		Properties propriedadesParticao = jobOperator.getParameters(contextoBatch.getExecutionId());
		Long clienteId = (Long) propriedadesParticao.get("clienteId");
		return clienteId;
	}
	
	@Override
	public void close() throws Exception{
		
	}
	
	@Override
	public Object readItem() throws Exception{
		if (iterator.hasNext()) {
			Lancamento proximo = iterator.next();
			indiceLido++;
			return proximo;
		}
		else
			return null;
	}
	
	@Override
	public Serializable checkpointInfo() throws Exception {
		return indiceLido;
	}
}
