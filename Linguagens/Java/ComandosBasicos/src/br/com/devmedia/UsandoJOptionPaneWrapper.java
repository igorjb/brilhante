package br.com.devmedia;

import javax.swing.JOptionPane;

public class UsandoJOptionPaneWrapper 
{
	public static void main(String[] args) 
	{
		//entrada
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			
			String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome");
			
			String aux = JOptionPane.showInputDialog(null, "Digite seu sal�rio");
			double salario = 0;
			try 
			{	
				salario = Double.parseDouble(aux);
				
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null, "Erro!!! Dado inv�lido!!!");
				aux = JOptionPane.showInputDialog(null, "Digite seu sal�rio em n�meros:");
				salario = Double.parseDouble(aux);
			}
			
			aux = JOptionPane.showInputDialog(null, "Digite sua idade");
			int idade = Integer.parseInt(aux);
			
			//processamento
			String nomeCompleto = nome + " " + sobrenome;
			
			
			//sa�da
			JOptionPane.showMessageDialog(null, "Nome Completo: " + nomeCompleto + 
												", Sal�rio: " + salario +
												", Idade: " + idade);
			//JOptionPane.showMessageDialog(null, "Sal�rio: " + salario);
			//JOptionPane.showMessageDialog(null, "Idade: " + idade);
			
	}
}
