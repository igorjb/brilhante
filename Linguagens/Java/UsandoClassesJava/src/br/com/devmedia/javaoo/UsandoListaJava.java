package br.com.devmedia.javaoo;

import java.util.ArrayList;

public class UsandoListaJava 
{
	public static void main(String[] args) 
	{
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Maria");
		lista.add("Pedro");
		lista.add("Joana");
		lista.add("Maria");
		
		if (lista.contains("Maria"))
		{
			System.out.println("Achou");
		}
		else
		{
			System.out.println("Objeto não encontrado");
		}
		
		String elemento = lista.get(0);
		System.out.println(elemento);
		
		String ultimoElemento = lista.get(lista.size() - 1);
		System.out.println(ultimoElemento);
	}

}
