package br.triadworks.jsf.modelo;

import java.util.Calendar;

public class Caloteiro {
	
	private Long id;
	private String nome;
	private String email;
	private Float devendo;
	private String dataDivida;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDataDivida() {
		return dataDivida;
	}
	public void setDataDivida(String dataDivida) {
		this.dataDivida = dataDivida;
	}
	
	public Float getDevendo() {
		return devendo;
	}
	public void setDevendo(Float devendo) {
		this.devendo = devendo;
	}
	
	
}
