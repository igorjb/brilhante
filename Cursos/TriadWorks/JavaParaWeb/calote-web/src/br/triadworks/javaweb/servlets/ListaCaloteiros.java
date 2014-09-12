package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.modelo.Caloteiro;

@WebServlet("/listaCaloteiros")
public class ListaCaloteiros extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Connection conexao = (Connection) request.getAttribute("conexao");
		CaloteiroDAO dao = new CaloteiroDAO(conexao);
		List<Caloteiro> lista = dao.getLista();
		
		request.setAttribute("lista", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCaloteiros.jsp");
		rd.forward(request,response);
	}
		
}
