package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controlePrincipal")
@RequestScoped
public class ControlePrincipal {

	public String mensagem;
	
	public ControlePrincipal()
	{
		mensagem = "Bem Vindo a sua primeira aplicação com JSF2";
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
