package br.triadworks.javaweb.modelo;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

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
		String nome = request.getParameter("nome");
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setId(Long.valueOf(id));
		caloteiro.setNome(nome);
		
		Connection conexao = (Connection) request.getAttribute("conexao");
		CaloteiroDAO dao = new CaloteiroDAO(conexao);
		List<Caloteiro> calot = dao.exibe(caloteiro);
		
		request.setAttribute("caloteiro", calot);
		
		dao.deleta(caloteiro);
		
		RequestDispatcher rd = request.getRequestDispatcher("/caloteiro-excluido.jsp");
		rd.forward(request, response);
		
	}

	
}
