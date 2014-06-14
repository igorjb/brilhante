package br.com.devmedia.javaoo;

import java.util.Date;

public class UsandoDataHora 
{
	public static String getDataFormatada(Date data) 
	{
		int dia = data.getDate();
		int mes = data.getMonth() + 1;
		int ano = data.getYear() + 1900;
		
		String retorno = (dia + "/" + mes + "/" + ano);
		
		return retorno;
	}
	
	public static void main(String[] args) 
	{	
		Date agora = new Date();
		
		String dataFormat = getDataFormatada(agora);
		
		System.out.println(dataFormat);
		
		String formatoExtenso = agora.toString();
		
		System.out.println(formatoExtenso);

	}

}
