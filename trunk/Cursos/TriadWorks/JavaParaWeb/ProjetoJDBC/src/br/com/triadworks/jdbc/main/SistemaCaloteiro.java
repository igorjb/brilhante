package br.com.triadworks.jdbc.main;

import java.util.Calendar;

import br.com.triadworks.jdbc.dao.CaloteiroDAO;
import br.com.triadworks.jdbc.modelo.Caloteiro;

public class SistemaCaloteiro {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setNome("Alisson");
		caloteiro.setEmail("alisson@caloteiro.com.br");
		caloteiro.setDevendo(200);
		caloteiro.setDataDivida(Calendar.getInstance());
		
		CaloteiroDAO dao = new CaloteiroDAO();
		dao.adiciona(caloteiro);
		
		System.out.println("Gravado!");
	}

}
