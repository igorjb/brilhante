package br.triadworks.jsf.modelo;

import java.util.Calendar;
import java.util.Date;

public class Caloteiro {
	
	private Long id;
	private String nome;
	private String email;
	private Float devendo;
	private Date dataDivida;
	
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
	
	public Date getDataDivida() {
		return dataDivida;
	}
	public void setDataDivida(Date dataDivida) {
		this.dataDivida = dataDivida;
	}
	
	public Float getDevendo() {
		return devendo;
	}
	public void setDevendo(Float devendo) {
		this.devendo = devendo;
	}
	
	
}
