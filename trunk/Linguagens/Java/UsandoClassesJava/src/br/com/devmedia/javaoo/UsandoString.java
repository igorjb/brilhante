package br.com.devmedia.javaoo;

import javax.swing.JOptionPane;

public class UsandoString 
{
	public static void main(String[] args) 
	{
		String nome = JOptionPane.showInputDialog(null, "Digite o nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
		
		String sobrenome = "Brilhante";
		double salario = 1000.8;
		
		String endereco = new String("Rua América");
		
		System.out.println(nome.concat(sobrenome));
		System.out.println(nome);
		System.out.println(sobrenome);
		
		System.out.println(nome.toUpperCase());
		
		System.out.println(nome.charAt(0));

	}

}
