package controle;

import javax.faces.event.ActionEvent;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;

@ManagedBean(name="controleComponentes")
public class ControleComponentes implements Serializable{
	private String texto;
	private String idComponente;
	
	public ControleComponentes(){
		
	}
	
	public String geraTexto(){
		texto = "Texto gerado: < > & <b>Texto em negrito</b>";
		return "componentesParte2";
	}

	public String executar()
	{
		return "componentesParte3";
	}
	public void Listener(ActionEvent event)
	{
		UIComponent source = event.getComponent();
		idComponente = "Componente que executou a a��o: " + source.getId();
	}
	public String getTexto() {
		return texto;
	}
  
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}
	
	
}
