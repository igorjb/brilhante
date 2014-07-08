package br.triadworks.javaweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sistema")
public class ServletSistema extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("logica");
		
		if (acao.equals("AdicionaCaloteiro")){
			new AdicionaCaloteiro().executa(request, response);
		} else if (acao.equals("ListaCaloteiros")){
			new ListaCaloteiros().executa(request, response);
		} else if (acao.equals("AlteraCaloteiro")){
			new AlteraCaloteiro().executa(request, response);
		} else if (acao.equals("ExcluiCaloteiro")){
			new ExcluiCaloteiro().executa(request, response);
		}
	}

}
