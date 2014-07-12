package br.triadworks.javaweb.modelo;

import java.io.IOException;
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
		CaloteiroDAO dao = new CaloteiroDAO();
		List<Caloteiro> lista = dao.getLista();
		
		request.setAttribute("lista", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCaloteiros.jsp");
		rd.forward(request,response);
		
	}
	

}
