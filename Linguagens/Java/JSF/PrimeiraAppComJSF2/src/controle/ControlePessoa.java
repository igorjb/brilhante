package controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name="controlePessoa")
@SessionScoped
public class ControlePessoa implements Serializable
{
	private Boolean opcaoSelecionada;
	private Boolean pessoaFisica;
	private Integer id;
	private String nome;
	private String cpf;
	private String cnpj;
	private String saida;
	
	public ControlePessoa() 
	{
		opcaoSelecionada = false;
	}
	
	public void tipoChange(ValueChangeEvent e)
	{
		pessoaFisica = (Boolean) e.getNewValue();
		selecionar();
	}
	
	public String selecionar()
	{
		opcaoSelecionada = true;
		String selecao = pessoaFisica == true ? "Pessoa Física" : "Pessoa Jurídica";
		FacesMessage msg = new FacesMessage("Tipo selecionado: " + selecao);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "formPessoa";
	}
	
	public String exibirDados() {
		saida = "";
		saida += "Valores recebidos: ";
		saida += "<br/>" + (pessoaFisica ? "Nome: " + nome : "Razão Social: " + nome);
		saida += "<br/>" + (pessoaFisica ? "CPF: " + cpf : "CNPJ: " + cnpj);
		FacesMessage msg = new FacesMessage("Dados recebidos com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
		return "dadosPessoa";
	}

	public String voltar()
	{
		opcaoSelecionada = false;
		id = null;
		nome = "";
		cpf = "";
		cnpj = "";
		
		return "formPessoa";
	}
	public Boolean getOpcaoSelecionada() {
		return opcaoSelecionada;
	}

	public Boolean getPessoaFisica() {
		return pessoaFisica;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getSaida() {
		return saida;
	}

	public void setOpcaoSelecionada(Boolean opcaoSelecionada) {
		this.opcaoSelecionada = opcaoSelecionada;
	}

	public void setPessoaFisica(Boolean pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	
}
