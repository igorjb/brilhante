package controle;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private Integer id;
	private String nome;
	private String telefone;
	
	public Pessoa(){
		
	}
	
	public Pessoa(Integer id, String nome, String telefone){
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
