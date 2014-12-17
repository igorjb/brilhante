package modelo;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Pessoa implements Serializable{
	
	private Integer id;
	@NotEmpty(message="O nome deve ser informado")
	@Length(max=40, message="O nome não pode ter mais que {max} caracteres")
	private String nome;
	@Email(message="Informe um email válido")
	private String email;

	public Pessoa(){
		
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
	
	
}
