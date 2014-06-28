package br.triadworks.jdbc.main;

import java.util.Calendar;
import java.util.List;

import br.triadworks.jdbc.dao.CaloteiroDAO;
import br.triadworks.jdbc.modelo.Caloteiro;

public class SistemaCaloteiro {

	public static void main(String[] args) {
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setNome("Katia");
		caloteiro.setEmail("katia@caloteiro.com.br");
		caloteiro.setDevendo(250);
		caloteiro.setDataDivida(Calendar.getInstance());
		
		CaloteiroDAO dao = new CaloteiroDAO();
		
		//dao.adiciona(caloteiro);
		
		//System.out.println("Gravado!");
		
		//acessando o getLista do DAO
		List<Caloteiro> lista = dao.getLista();
		
		for (Caloteiro c : lista) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Devendo: R$ " + c.getDevendo() );
			System.out.println("Data: " + c.getDataDivida().getTime() + "\n");
		}
		
		
		caloteiro.setNome("Katia Santos");
		caloteiro.setEmail("katia_santos@caloteiro.com.br");
		caloteiro.setDevendo(100);
		caloteiro.setDataDivida(Calendar.getInstance());
		caloteiro.setId(2L);
		
		//dao.altera(caloteiro);
		
		caloteiro.setId(2L);
		
		//dao.deleta(caloteiro);
		
		//System.out.println("Deletado");
	}
}
