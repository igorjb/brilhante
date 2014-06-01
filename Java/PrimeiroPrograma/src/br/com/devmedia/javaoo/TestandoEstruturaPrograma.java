package br.com.devmedia.javaoo;

import java.util.Scanner;

public class TestandoEstruturaPrograma {

	/*
	  Classe que apresenta a estrutura básica de um programa
	*/
	public static void main(String[] args) 
	{
		//entrada
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = entrada.nextInt();
		
		//processamento
		int soma = num1 + num2;
		
		int subtr = num1 - num2;
		
		int multip = num1 * num2;
		
		int divis = num1 / num2;
		
		
		
		//saída
		System.out.println("Cheguei...");
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtr);
		System.out.println("Multiplicacao: " + multip);
		System.out.println("Divisao: " + divis);

	}

}
