package br.com.devmedia.batch.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.Properties;

import javax.batch.api.chunk.AbstractItemReader;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named("itemReaderDesempenho")
public class ItemReaderDesempenho extends AbstractItemReader{

	@Inject
	private JobContext jobContext;
	
	private FileReader fr;
	private BufferedReader br;
	private String line;
	private int numeroRegistros;
	
	@Override
	//Método com a função de realizar a abertura do arquivo
	public void open(Serializable prevCheckpointInfo) throws Exception {
		
		//JobOperator utilizado para se obter os parâmetros de
		//execução definidos para o Job.
		JobOperator jobOperator = BatchRuntime.getJobOperator();
		
		//Obtém os parâmetros de execução existentes para este
		//Job definidos em tempo de execução.
		Properties jobParameters = jobOperator.getParameters(jobContext.getExecutionId());
		
		//Obtém o nome do arquivo de entrada, enviado como parâmetro 
		//no momento da execução da Job
		String resourceName = (String) jobParameters.get("INPUT_DATA_FILENAME");
		
		//Realiza o processo de abertura do arquivo
		fr = new FileReader(resourceName);
		br = new BufferedReader(fr);
		
		System.out.println("[ItemReaderDesempenho] Abertura do arquivo de notas dos alunos a partir do registro: " + numeroRegistros);
	}
	
	@Override
	//Método executado logo após o método open(). Tem como objetivo 
	//realizar a leitura registro a registro.
	public Object readItem() throws Exception {
		//Realiza a leitura do arquivo.
		line = br.readLine();
		
		//Valida se o registro é diferente de null para que
		//se possa realizar a contagem do mesmo. 
		if (line != null){
			/* A partir do momento em que o registro é lido com sucesso,
			 * incrementamos 1 ao número de registros
			 */
			numeroRegistros++;
		}
		
		return line;
	}
	
	@Override
	//Método de fechamento do arquivo, executado ao final da leitura 
	//de todos os registros.
	public void close() throws Exception {
		// TODO Auto-generated method stub
		br.close();
		fr.close();
		System.out.println("[ItemReaderDesempenho] 	Método de Fechamento"
				+ "do Arquivo foi Executado. Total de Registros Lidos:  "
				+ numeroRegistros + "]]");
	}
	
	
	
	
}
