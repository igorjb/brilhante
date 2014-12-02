package controle;

import java.util.List;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import conversores.ConverterCidade;

@ManagedBean(name="controleAulaConversores")
public class ControleAulaConversores implements Serializable{

	private Calendar nascimento;
	private Cidade cidade;
	private List<Cidade> listaCidades = new ArrayList<Cidade>();
	private ConverterCidade converterCidade;
	
	public ControleAulaConversores() {
		nascimento = Calendar.getInstance();
		listaCidades.add(new Cidade(1, "São Paulo", "SP"));
		listaCidades.add(new Cidade(2, "Porto Alegre", "RS"));
		listaCidades.add(new Cidade(3, "Passo Fundo", "RS"));
		converterCidade = new ConverterCidade(listaCidades);
	}
	
	public ConverterCidade getConverterCidade() {
		return converterCidade;
	}

	public void setConverterCidade(ConverterCidade converterCidade) {
		this.converterCidade = converterCidade;
	}

	public String lerDados() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FacesMessage msg = new FacesMessage("Informe uma data válida");
		if (nascimento != null && cidade != null)
		{
			msg = new FacesMessage("Nascimento: "+sdf.format(nascimento.getTime()) +
					" Cidade:  " + cidade.getNome() + " UF:  " + cidade.getUf());
			
		}
		FacesContext.getCurrentInstance().addMessage("", msg);
		nascimento = null;
		return "formConversores";
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getListaCidades() {
		return listaCidades;
	}

	public void setListaCidades(List<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}
	
	

}
