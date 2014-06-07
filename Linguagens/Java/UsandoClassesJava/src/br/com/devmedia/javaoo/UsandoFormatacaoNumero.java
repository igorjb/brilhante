package br.com.devmedia.javaoo;

import java.text.DecimalFormat;

public class UsandoFormatacaoNumero 
{
	public static void main(String[] args) 
	{
		double result = 100000.0 / 3.0;
		
		System.out.println("Result: " + new DecimalFormat("#,###.00").format(result));

	}
}
