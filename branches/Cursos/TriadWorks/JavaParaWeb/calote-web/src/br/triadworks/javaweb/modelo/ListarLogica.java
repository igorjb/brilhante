package br.triadworks.javaweb.modelo;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;

public class ListarLogica implements Logica
{
	public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection connection = (Connection) request.getAttribute("conexao");
		CaloteiroDAO dao = new CaloteiroDAO(connection);
		List<Caloteiro> lista = dao.getLista();
		
		request.setAttribute("lista", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCaloteiros.jsp");
		rd.forward(request, response);
	}
}
