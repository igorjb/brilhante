package br.triadworks.javaweb.modelo;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;

public class ListaCaloteirosLogica implements Logica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conexao = (Connection) request.getAttribute("conexao");
		CaloteiroDAO dao = new CaloteiroDAO(conexao);
		List<Caloteiro> lista = dao.getLista();
		int count = dao.contador();
	
		request.setAttribute("lista", lista);
		request.setAttribute("contador", count);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCaloteiros.jsp");
		rd.forward(request,response);
		
	}
	

}
