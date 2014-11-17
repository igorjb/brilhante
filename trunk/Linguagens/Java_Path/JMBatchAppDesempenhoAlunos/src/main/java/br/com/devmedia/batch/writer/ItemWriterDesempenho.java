package br.com.devmedia.batch.writer;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Properties;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;

import br.com.devmedia.batch.TO.BoletimTO;

public class ItemWriterDesempenho extends AbstractItemWriter
{
	@Inject
	private JobContext jobContext;
	
	private FileWriter fw = null;
	private PrintWriter pw = null;
	
	@Override
	//Método com a função de realizar a gravação das informações recebidas.
	//Como o item-count é 10, a persistência sempre será com uma 
	//lista de 10 registros 
	public void writeItems(@SuppressWarnings("rawtypes") List list) throws Exception {
		//JobOperator utilizado para se obter os parâmetros de execução 
		//definidos para o job.
		JobOperator jobOperator = BatchRuntime.getJobOperator();
		
		//Obtém os parâmetros de execução existentes para este Job
		//definidos em tempo de execução
		Properties jobParameters = jobOperator.getParameters(jobContext.getExecutionId());
		
		//Obtém nome do arquivo de saída, enviado como parâmetro
		//no momento da execução do Job
		String resourceName = (String) jobParameters.get("OUTPUT_DATA_FILENAME");
		
		//Realiza o processo de abertura de arquivo.
		fw = new FileWriter(resourceName, true);
		pw = new PrintWriter(fw);
		
		BoletimTO boletimTO = null;
		String registro = null;
		
		//Prepara estrutura para formatação do valor númerico da média.
		DecimalFormat df = new DecimalFormat("#0.00");
		
		//Realiza a gravação de todos os itens recebidos como parâmetro.
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			boletimTO = (BoletimTO) obj;
			registro = (boletimTO.getAlunoTO().getMatricula() + ";" +
					boletimTO.getAlunoTO().getNome() + ";" + df.format(boletimTO.getMediaFinal()))
					+ ";" + boletimTO.getSituacao();
			pw.println(registro);
		}
		
		//Realiza o processo de fechamento do arquivo.
		fw.close();
		pw.close();
		
		System.out.println("[ItemWriterDesempenho] Itens Gravados.");
		
		
	}
	
	
	
	
}
