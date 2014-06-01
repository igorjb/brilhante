package br.com.devmedia;

import javax.swing.JOptionPane;

public class UsandoArrays 
{
	public static void main(String[] args) 
	{
		//entrada
		int idade[] = new int[10];
		/*
		int jogoDaVelha[] [] = new int[3] [3];
		
		jogoDaVelha [0] [0] = 100;
		jogoDaVelha [0] [1] = 200;
		jogoDaVelha [0] [2] = 300;
		jogoDaVelha [1] [0] = 300;
		
		jogoDaVelha [2] [2] = 300;
		
		int dados[] = { 1, 2, 3, 4, 6};
		
		System.out.println(jogoDaVelha[0] [1]);
		
		*/
		for (int i = 0; i < idade.length; i++) 
		{
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade " + (i + 1)));
		}
		
		
		//processamento
		int somaIdade = 0;
		
		for (int i = 0; i < idade.length; i++) 
		{
			somaIdade = somaIdade + idade[i];
		}
		
		double media = (somaIdade) / (double) idade.length; 
		
		//saída
		JOptionPane.showMessageDialog(null, "Média: " + media);
		
	}
}
