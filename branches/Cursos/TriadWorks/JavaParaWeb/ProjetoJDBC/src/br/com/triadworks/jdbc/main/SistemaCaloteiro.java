package br.com.triadworks.jdbc.main;

import java.util.Calendar;
import java.util.List;

import br.com.triadworks.jdbc.dao.CaloteiroDAO;
import br.com.triadworks.jdbc.modelo.Caloteiro;

public class SistemaCaloteiro {

	public static void main(String[] args) 
	{
		//Inserir
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setNome("Alisson");
		caloteiro.setEmail("alisson@caloteiro.com.br");
		caloteiro.setDevendo(200);
		caloteiro.setDataDivida(Calendar.getInstance());
		
		CaloteiroDAO dao = new CaloteiroDAO();
		dao.adiciona(caloteiro);
		
		System.out.println("Gravado!");
		
		//Alterar
		caloteiro.setNome("Joao");
		caloteiro.setEmail("joao@caloteiro.com.br");
		caloteiro.setDevendo(200);
		caloteiro.setDataDivida(Calendar.getInstance());
		caloteiro.setId(2l);
		
		
		dao.altera(caloteiro);
		System.out.println("Alterado!");
		
		//Excluir Registro Alterado
		dao.deleta(caloteiro);
		
		System.out.println("Excluido!");
		
		//Listar
		//acessando o getLista da DAO
		
		List<Caloteiro> lista = dao.getLista();
		
		for (Caloteiro c : lista) 
		{
			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Devendo: R$ " + c.getDevendo() );
			System.out.println("Data: " + c.getDataDivida().getTime() + "\n");
		}
		
		
	}

}
