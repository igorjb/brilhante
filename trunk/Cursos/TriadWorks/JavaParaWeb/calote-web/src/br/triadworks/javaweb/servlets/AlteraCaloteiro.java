package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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

@WebServlet("/AlteraCaloteiro")
public class AlteraCaloteiro extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String devendo = request.getParameter("devendo");
		String dataDivida = request.getParameter("dataDivida");
		Calendar dataDividaConvertida = null;
		
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataDivida);
			dataDividaConvertida = Calendar.getInstance();
			dataDividaConvertida.setTime(data);
		} catch (ParseException e) {
			out.println("Erro de conversao de data");
			throw new CaloteiroServletException();
		}

		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setId(Long.valueOf(id));
		caloteiro.setNome(nome);
		caloteiro.setEmail(email);
		caloteiro.setDevendo(Float.parseFloat(devendo));
		caloteiro.setDataDivida(dataDividaConvertida);
		
		Connection conexao = (Connection) request.getAttribute("conexao");
		CaloteiroDAO dao = new CaloteiroDAO(conexao);
		dao.altera(caloteiro);
		
		RequestDispatcher rd = request.getRequestDispatcher("/caloteiro-alterado.jsp");
		rd.forward(request, response);
		
		
	}
	
}
