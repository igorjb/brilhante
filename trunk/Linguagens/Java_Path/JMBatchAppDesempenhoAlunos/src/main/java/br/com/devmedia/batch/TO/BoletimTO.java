package br.com.devmedia.batch.TO;

public class BoletimTO {

	private AlunoTO alunoTO;
	private double mediaFinal;
	private String situacao;
	
	public BoletimTO() {
	}

	public AlunoTO getAlunoTO() {
		return alunoTO;
	}

	public void setAlunoTO(AlunoTO alunoTO) {
		this.alunoTO = alunoTO;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
}
