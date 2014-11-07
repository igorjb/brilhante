package br.com.devmedia.batch.interfaces;

public class ParameterInterface {
	
	//Representa o nome do arquivo XML JSL sem a extensão ".xml".
	public static final String JOB_NAME = "JobDesempenho";
	
	//Esse bloco de código representa os arquivos de entrada e saída
	public static final String INPUT_DATA_FILENAME = 
			"C:/arquivo_desempenho/arquivoNotasAlunos.csv";
	public static final String OUTPUT_DATA_FILENAME = 
			"C:/arquivo_desempenho/arquivoDesempenhoAlunos.csv";
	public static final String OUTPUT_APPROVED_DATA_FILENAME = 
			"C:/arquivo_desempenho/arquivoAlunosAprovados.csv";
	public static final String OUTPUT_DISAPPROVED_DATA_FILENAME =
			"C:/arquivo_desempenho/arquivoAlunosReprovados.csv";
	
	//Constantes que representam a situação dos alunos
	public static final String APPROVED = "Aprovado";
	public static final String DISAPPROVED = "Reprovado";
}
