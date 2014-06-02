package br.com.devmedia;

import javax.swing.JOptionPane;

public class UsandoJOptionPaneWrapper 
{
	public static void main(String[] args) 
	{
		//entrada
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			
			String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome");
			
			String aux = JOptionPane.showInputDialog(null, "Digite seu salário");
			double salario = 0;
			try 
			{	
				salario = Double.parseDouble(aux);
				
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null, "Erro!!! Dado inválido!!!");
				aux = JOptionPane.showInputDialog(null, "Digite seu salário em números:");
				salario = Double.parseDouble(aux);
			}
			
			aux = JOptionPane.showInputDialog(null, "Digite sua idade");
			int idade = Integer.parseInt(aux);
			
			//processamento
			String nomeCompleto = nome + " " + sobrenome;
			
			
			//saída
			JOptionPane.showMessageDialog(null, "Nome Completo: " + nomeCompleto + 
												", Salário: " + salario +
												", Idade: " + idade);
			//JOptionPane.showMessageDialog(null, "Salário: " + salario);
			//JOptionPane.showMessageDialog(null, "Idade: " + idade);
			
	}
}
