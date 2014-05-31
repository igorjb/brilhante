package br.com.devmedia;

import java.util.Scanner;

public class UsandoFor 
{
	public static void main(String[] args) 
	{
		//entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o n�mero da tabuada:");
		int num = entrada.nextInt();
		
		System.out.println("Informe a opera��o:");
		System.out.println("1 - Soma, 2 - Subtra��o, 3 - Multiplica��o, 4 - Divis�o");
		int operacao = entrada.nextInt();
		
		
		//processamento e saida
		for (int i = 1; i <= 10; i++)
		{
			String txt = "";
			int op = 0;
			
			if (operacao == 1)
			{
				txt = " + ";
				op = num + i;
			}
			else if (operacao == 2)
			{
				txt = " - ";
				op = num - i;
			}
			else if (operacao == 3)
			{
				txt = " * ";
				op = num * i;
			}
			else if (operacao == 4)
			{
				txt = " / ";
				op = num / i;
			}
			
			System.out.println(num + txt + i + " = " + op);
		}
	}
}
