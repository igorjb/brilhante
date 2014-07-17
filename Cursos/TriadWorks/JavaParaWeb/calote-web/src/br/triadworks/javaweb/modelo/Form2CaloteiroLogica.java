package br.triadworks.javaweb.modelo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;

public class Form2CaloteiroLogica implements Logica
{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setId(Long.valueOf(id));
		
		CaloteiroDAO dao = new CaloteiroDAO();
		List<Caloteiro> calot = dao.exibe(caloteiro);
		
		request.setAttribute("caloteiro", calot);
		
		RequestDispatcher rd = request.getRequestDispatcher("/exclui-caloteiro.jsp");
		rd.forward(request, response);
	}
}
