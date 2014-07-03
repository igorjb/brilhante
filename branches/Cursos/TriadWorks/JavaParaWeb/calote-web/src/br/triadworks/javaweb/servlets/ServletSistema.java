package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.dao.ConnectionFactory;
import br.triadworks.javaweb.modelo.Caloteiro;
import br.triadworks.javaweb.modelo.Logica;

public class ServletSistema extends HttpServlet
{
	
	protected void service(HttpServletRequest request,
							HttpServletResponse response) throws IOException, ServletException{
		try {
			String acao = request.getParameter("logica");
			String nomeClasse = "br.triadworks.javaweb.modelo. "+acao+"Logica";
			Class classe = Class.forName(nomeClasse);
			Object obj;
			obj = classe.newInstance();
			Logica logica = (Logica) obj;
			logica.executar(request, response);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
