package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.modelo.Caloteiro;

@WebServlet("/FormCaloteiro")
public class FormCaloteiro extends HttpServlet 
{

	protected void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setId(Long.valueOf(id));
		
		CaloteiroDAO dao = new CaloteiroDAO();
		List<Caloteiro> calot = dao.exibe(caloteiro);
		
		request.setAttribute("caloteiro", calot);
		
		RequestDispatcher rd = request.getRequestDispatcher("/form-caloteiro.jsp");
		rd.forward(request, response);
	}
	
}
