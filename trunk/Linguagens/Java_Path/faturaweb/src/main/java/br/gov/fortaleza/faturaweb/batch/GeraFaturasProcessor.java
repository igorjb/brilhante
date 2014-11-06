package br.gov.fortaleza.faturaweb.batch;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

import br.gov.fortaleza.faturaweb.model.Lancamento;

@Dependent
@Named("GeraFaturasProcessor")
public class GeraFaturasProcessor implements ItemProcessor{

	@Override
	public Object processItem (Object o) throws Exception{
		Lancamento lancamento = (Lancamento) o;
		lancamento.processa();
		return o;
	}
}
