package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.modelo.Caloteiro;
import br.triadworks.javaweb.modelo.Logica;

@WebServlet("/sistema")
public class ServletSistema extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String acao = request.getParameter("logica");
		String nomeClasse = "br.triadworks.javaweb.modelo."+acao+"Logica";

		
		try {
			Class classe = Class.forName(nomeClasse);
			Object obj = classe.newInstance();
			Logica logica = (Logica) obj;
			logica.executa(request, response);
		} catch (ClassNotFoundException e) {
			throw new CaloteiroServletException(e.getMessage());
		} catch (InstantiationException e) {
			throw new CaloteiroServletException(e.getMessage());
		} catch (IllegalAccessException e) {
			throw new CaloteiroServletException(e.getMessage());
		}
		
		//Para usar servlets
		/*
		if (acao.equals("ListaCaloteiros")){
			new ListaCaloteiros().executa(request, response);
		} else if (acao.equals("AdicionaCaloteiro")){
			new AdicionaCaloteiro().executa(request, response);
		}else if (acao.equals("FormCaloteiro")){
			new EditaCaloteiro().executa(request, response);
		} else if (acao.equals("AlteraCaloteiro")){
			new AlteraCaloteiro().executa(request, response);
		} else if (acao.equals("ExcluiCaloteiro")){
			new ExcluiCaloteiro().executa(request, response);
		}
		*/
	}

}
