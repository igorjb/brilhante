package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;

import javax.servlet.ServletException;

import java.text.SimpleDateFormat;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.modelo.Caloteiro;

@WebServlet("/adicionaCaloteiro")
public class AdicionaCaloteiro extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
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
		
		//Montando o objeto Caloteiro
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setNome(nome);
		caloteiro.setEmail(email);
		caloteiro.setDevendo(new Integer(devendo));
		caloteiro.setDataDivida(dataDividaConvertida);
		
		//inserindo no banco com o CaloteiroDAO
		CaloteiroDAO dao = new CaloteiroDAO();
		dao.adiciona(caloteiro);
		
		//imprime em HTML o resultado
		out.println("<html>");
		out.println("<body>");
		out.println("Caloteiro " + caloteiro.getNome() +
					" adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
	}

}
