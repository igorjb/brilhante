package br.triadworks.javaweb.modelo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;

public class ExcluiCaloteiroLogica implements Logica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setId(Long.valueOf(id));
		
		CaloteiroDAO dao = new CaloteiroDAO();
		dao.deleta(caloteiro);
		
		RequestDispatcher rd = request.getRequestDispatcher("/caloteiro-excluido.jsp");
		rd.forward(request, response);
		
	}

	
}
