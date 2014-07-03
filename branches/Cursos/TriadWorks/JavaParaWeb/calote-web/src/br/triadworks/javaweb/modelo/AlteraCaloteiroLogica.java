package br.triadworks.javaweb.modelo;

import java.sql.Connection;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;

public class AlteraCaloteiroLogica implements Logica{

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception 
	{
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String devendo = request.getParameter("devendo");
		String dataDivida = request.getParameter("dataDivida");
		
		
		/*
		Connection conexao = (Connection) request.getAttribute("conexao");
		Caloteiro caloteiro = new Caloteiro();
		CaloteiroDAO dao = new CaloteiroDAO(conexao);
		
		caloteiro.setNome("Alisson Soares");
		caloteiro.setEmail("alisson_soares@caloteiro.com.br");
		caloteiro.setDevendo(100);
		caloteiro.setDataDivida(Calendar.getInstance());
		
		caloteiro.setId(1l);
		dao.altera(caloteiro);
		*/
		
		
	}

}
