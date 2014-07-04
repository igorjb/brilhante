package br.triadworks.javaweb.modelo;

import java.io.PrintWriter;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.servlets.CaloteiroServletException;

public class AlteraCaloteiroLogica implements Logica{

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception 
	{
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
			out.println("Erro de conversao da data");
			throw new CaloteiroServletException();
		}
		
		Caloteiro caloteiro = new Caloteiro(); 
		caloteiro.setId(new Long(id));
		caloteiro.setNome(nome);
		caloteiro.setEmail(email);
		caloteiro.setDevendo(new Integer(devendo));
		caloteiro.setDataDivida(dataDividaConvertida);
		
		Connection conexao = (Connection) request.getAttribute("conexao");
		
		CaloteiroDAO dao = new CaloteiroDAO(conexao);
		
		dao.selecionaCaloteiro(caloteiro);
		
		RequestDispatcher rd = request.getRequestDispatcher("/edita-caloteiro.jsp");
		rd.forward(request, response);
	}

}
