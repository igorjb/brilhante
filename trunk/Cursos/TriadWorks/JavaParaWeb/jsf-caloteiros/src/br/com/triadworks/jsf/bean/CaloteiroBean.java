package br.com.triadworks.jsf.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;

import br.triadworks.jsf.modelo.Caloteiro;

@ManagedBean
public class CaloteiroBean {

	private Caloteiro caloteiro = new Caloteiro();

	public Caloteiro getCaloteiro() {
		return caloteiro;
	}
	
	public void adiciona()
	{
		System.out.println("Gravando caloteiro no banco de dados...");
		System.out.println("Nome:" +this.caloteiro.getNome());
		System.out.println("Email:" +this.caloteiro.getEmail());
		System.out.println("Devendo:"+this.caloteiro.getDevendo());
		System.out.println("Data Dívida:"+this.caloteiro.getDataDivida());
		/*Date date = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(data);
		Calendar dataDividaConvertida = null;
		dataDividaConvertida = Calendar.getInstance();
		dataDividaConvertida.setTime(data);
		*/
		this.caloteiro = new Caloteiro();
	}
}
