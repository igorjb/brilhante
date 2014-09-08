package controle;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controlePrincipal")
@ApplicationScoped
public class ControlePrincipal {

	public String mensagem;
	
	public ControlePrincipal()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
		mensagem = "A aplicação foi ao ar em: " + sdf.format(Calendar.getInstance().getTime());
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
