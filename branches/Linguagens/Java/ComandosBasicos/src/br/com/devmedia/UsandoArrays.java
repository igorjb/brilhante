package br.com.devmedia;

import javax.swing.JOptionPane;

public class UsandoArrays 
{
	public static void main(String[] args) 
	{
		//entrada
		int idade[] = new int[10];
		
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
