package br.com.devmedia.batch.TO;

import java.io.Serializable;

public class AlunoTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public AlunoTO() {
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	
}
