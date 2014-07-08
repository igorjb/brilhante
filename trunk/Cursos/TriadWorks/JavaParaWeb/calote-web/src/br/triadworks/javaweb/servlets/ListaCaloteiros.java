package br.triadworks.javaweb.servlets;

import java.io.IOException;

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

	protected void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CaloteiroDAO dao = new CaloteiroDAO();
		dao.getLista();
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCaloteiros.jsp");
		rd.forward(request, response);
	}
		
}
