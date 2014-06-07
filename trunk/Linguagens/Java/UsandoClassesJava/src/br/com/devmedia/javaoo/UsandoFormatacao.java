package br.com.devmedia.javaoo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsandoFormatacao 
{
	public static void main(String[] args) 
	{	
		Date agora = new Date();
		
		SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat formatadorDataPorExtenso = new SimpleDateFormat("EEEE, dd' de 'MMMMM' de 'yyyy");
		
		System.out.println(formatadorData.format(agora));
		System.out.println(formatadorDataPorExtenso.format(agora));
		
	}

}
