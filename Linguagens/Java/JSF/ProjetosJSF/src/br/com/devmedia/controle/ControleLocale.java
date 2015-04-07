package br.com.devmedia.controle;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="controleLocale")
@SessionScoped
public class ControleLocale {

	Locale currentLocale = new Locale("pt","BR");
	public ControleLocale() {
		// TODO Auto-generated constructor stub
	}
	public Locale getCurrentLocale() {
		return currentLocale;
	}
	public void setCurrentLocale(Locale currentLocale) {
		this.currentLocale = currentLocale;
	}
	
	

}
