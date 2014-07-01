package br.triadworks.javaweb.modelo;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.servlets.CaloteiroServletException;

public interface Logica 
{
	void executar(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
