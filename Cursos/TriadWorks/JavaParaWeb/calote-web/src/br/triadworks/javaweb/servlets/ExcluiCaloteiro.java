package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.modelo.Caloteiro;

@WebServlet("/ExcluiCaloteiro")
public class ExcluiCaloteiro extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setId(Long.valueOf(id));
		
		Connection conexao = (Connection) request.getAttribute("conexao");
		CaloteiroDAO dao = new CaloteiroDAO(conexao);
		dao.deleta(caloteiro);
		
		RequestDispatcher rd = request.getRequestDispatcher("/caloteiro-excluido.jsp");
		rd.forward(request, response);
		
		
	}
	
}
