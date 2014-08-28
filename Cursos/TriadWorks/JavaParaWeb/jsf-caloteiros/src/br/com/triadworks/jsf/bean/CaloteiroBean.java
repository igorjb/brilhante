package br.com.triadworks.jsf.bean;

import java.sql.Connection;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.triadworks.jsf.dao.CaloteiroDAO;
import br.triadworks.jsf.modelo.Caloteiro;

@ManagedBean
public class CaloteiroBean {

	private Caloteiro caloteiro = new Caloteiro();
	List<Caloteiro> caloteiros;
	public Caloteiro getCaloteiro() {
		return caloteiro;
	}
	
	public void adiciona() throws ParseException
	{
		System.out.println("Gravando caloteiro no banco de dados...");
		System.out.println("Nome:" +this.caloteiro.getNome());
		System.out.println("Email:" +this.caloteiro.getEmail());
		System.out.println("Devendo:"+this.caloteiro.getDevendo());
		System.out.println("Data Divída:"+ this.caloteiro.getDataDivida());
		
		CaloteiroDAO dao = new CaloteiroDAO();
		dao.adiciona(caloteiro);
		
		
		this.caloteiro = new Caloteiro();
	}
	
	public List<Caloteiro> getLista()
	{
		CaloteiroDAO dao = new CaloteiroDAO();
		caloteiros = dao.getLista(); 
		return caloteiros;
	}
	
}
