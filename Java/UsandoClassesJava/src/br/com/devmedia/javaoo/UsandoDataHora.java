package br.com.devmedia.javaoo;

import java.util.Date;

public class UsandoDataHora 
{
	public static void main(String[] args) 
	{
		String texto = "Ola Mundo";
		
		Date agora = new Date();
		
		int dia = agora.getDate();
		int mes = agora.getMonth() + 1;
		int ano = agora.getYear() + 1900;
		
		int hora = agora.getHours();
		int minuto = agora.getMinutes();
		
		System.out.println(dia + "/" + mes + "/" + ano);
		
		String formatoExtenso = agora.toString();
		
		System.out.println(formatoExtenso);

	}

}
