package controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="controleValidacao")
@RequestScoped
public class ControleValidacao implements Serializable {
	private String nome;
	private String telefone;
	private String email;
	private Long idade;
	private Double nota;
	
	public ControleValidacao()
	{
		
	}
	
	public String processaDados()
	{
		String saida = "";
		saida += " Nome: " + nome;
		saida += " Telefone: " + telefone;
		saida += " Email: " + email;
		saida += " Idade: " + idade;
		saida += " Nota: " + nota;
		
		FacesMessage msg = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage("", msg);
		
		nome = "";
		telefone = "";
		email = "";
		idade = null;
		nota = null;
		
		return "formValidacao";
		
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public Long getIdade() {
		return idade;
	}
	public Double getNota() {
		return nota;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIdade(Long idade) {
		this.idade = idade;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
	
}
