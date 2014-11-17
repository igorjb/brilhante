package br.com.devmedia.batch.batchlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Named;

import br.com.devmedia.batch.interfaces.ParameterInterface;

@Named("selecaoBatchlet")
public class SelecaoSituacaoBatchlet extends AbstractBatchlet{
	private FileWriter fw;
	private FileReader fr;
	private PrintWriter pw;
	private BufferedReader br;
	private String retorno;
	
	@Override
	//Método executado para realizar o processo de segmentação.
	public String process() throws Exception {
		//Método criado para realizar o armazenamento apenas dos alunos Aprovados.
		processarAprovados();
		//Método criado para realizar o armazenamento apenas dos alunos Reprovados.
		processarReprovados();
		//Método criado para remover o arquivo intermediário gerado pelo step 1.
		removerArquivoIntermediario();
		
		System.out.println("[SelecaoSituacaoBatchlet] Arquivos de Aprovados e Reprovados Gravados.");
		//Devolve um código de retorno, que poderá ser utilizado para verificar
		//se o Batchlet Step foi executado com sucesso.
		return retorno;
	}
	
	private void processarAprovados() {
		
		try {
			//Configura o arquivo gerado durante o processamento do step 1 para leitura.
			fr = new FileReader(ParameterInterface.OUTPUT_DATA_FILENAME);
			br = new BufferedReader(fr);
			
			//Configura o arquivo para gravação dos alunos aprovados.
			fw = new FileWriter(ParameterInterface.OUTPUT_APPROVED_DATA_FILENAME);
			pw = new PrintWriter(fw);
			
			String registro = null;
			String[] campos = null;
			
			while ((registro = br.readLine()) != null) {
				campos = registro.split(";");
				//Obtém o último campo do registro.
				//Campo que corresponde à situação do aluno (Aprovado e Reprovado).
				if(campos[campos.length-1].equals(ParameterInterface.APPROVED)){
					pw.println(registro);
				}
			}
			
			retorno = "OK";
			
			//Bloco catch para realizar o tratamento da exceção.
			
		} catch (Exception e) {
			System.out.println("Erro na Gravação do Arquivo de Aprovados: " + e.getMessage());
			retorno = "NOK";
			
			//Bloco finally para liberação dos recursos utilizados.
		} finally {
			try {
				pw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("Erro no fechamento dos Arquivos: " + e.getMessage());
				retorno = "NOK";
			}
		}
	}
	
	private void processarReprovados() {
		try {
			//Configura o arquivo para leitura gerado durante o processamento do step 1.
			fr = new FileReader(ParameterInterface.OUTPUT_DATA_FILENAME);
			br = new BufferedReader(fr);
			
			//Configura o arquivo para gravação dos alunos reprovados.
			fw = new FileWriter(ParameterInterface.OUTPUT_DISAPPROVED_DATA_FILENAME);
			pw = new PrintWriter(fw);
			
			String registro = null;
			String[] campos = null;
			
			while ((registro = br.readLine()) != null) {
				campos = registro.split(";");
				//Obtém o último campo do registro.
				//Campo que corresponde à situação do aluno (Aprovado e Reprovado).
				if(campos[campos.length-1].equals(ParameterInterface.DISAPPROVED)){
					pw.println(registro);
				}
			}
			retorno = "OK";
		//Bloco catch para realizar o tratamento de exceção.
		} catch (IOException e) {
			System.out.println("Erro na Gravação do Arquivo de Reprovados: " + e.getMessage());
			retorno = "NOK";
		//Bloco finally para liberação dos recursos utilizados.
		} finally {
			try {
				pw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("Erro no fechamento dos Arquivos: " + e.getMessage());
				retorno = "NOK";
			}
		}
	}
	
	private void removerArquivoIntermediario(){
		File arquivoIntermediario = new File(ParameterInterface.OUTPUT_DATA_FILENAME);
		
		//Remove o arquivo intermediário, gerado pelo step 1.
		arquivoIntermediario.delete();
	}
}
