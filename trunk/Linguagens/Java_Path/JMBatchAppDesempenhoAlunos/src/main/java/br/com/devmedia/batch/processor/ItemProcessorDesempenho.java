package br.com.devmedia.batch.processor;

import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;

import br.com.devmedia.batch.TO.AlunoTO;
import br.com.devmedia.batch.TO.BoletimTO;
import br.com.devmedia.batch.interfaces.ParameterInterface;

@Named("itemProcessorDesempenho")
public class ItemProcessorDesempenho implements ItemProcessor{

	@Override
	//Método executado para realizar a tratativa de cada um dos itens 
	//lidos pela etapa de ItemReader.
	public Object processItem(Object obj) throws Exception {
		// Instancia o objeto que representa o arquivo de entrada 
		// contendo os dados de notas dos alunos.
		AlunoTO alunoTO = new AlunoTO();
		
		//Realiza a divisão dos campos do arquivo utilizando como
		//delimitador o caractere ';'.
		String[] campos = obj.toString().split(";");
		
		//Realiza a formatação da entrada, estruturando a informação.
		alunoTO.setMatricula(Integer.parseInt(campos[0]));
		alunoTO.setNome(campos[1]);
		alunoTO.setNota1(Double.parseDouble(campos[2]));
		alunoTO.setNota2(Double.parseDouble(campos[3]));
		alunoTO.setNota3(Double.parseDouble(campos[4]));
		
		System.out.println("[ItemProcessorDesempenho] Item Processado.");
		
		//Retorna objeto tratado e com desempenho calculado.
		return calcularDesempenhoAluno(alunoTO);
	}
	
	//Método que tem como objetivo realizar o cálculo da média dos alunos
	//e definir o desempenho do mesmos.
	private BoletimTO calcularDesempenhoAluno(AlunoTO alunoTO){
		BoletimTO boletimTO = new BoletimTO();
		
		boletimTO.setAlunoTO(alunoTO);
		boletimTO.setMediaFinal((alunoTO.getNota1() + alunoTO.getNota2() + alunoTO.getNota3()) / 3);
		
		if (boletimTO.getMediaFinal() < 6)
		{
			boletimTO.setSituacao(ParameterInterface.DISAPPROVED);
		}
		else
		{
			boletimTO.setSituacao(ParameterInterface.APPROVED);
		}
		
		return boletimTO;
		
	}
	
	
	
	
	

}
