package br.com.devmedia.javaoo;

import javax.swing.JOptionPane;

public class UsandoMath 
{
	public static void main(String[] args) 
	{
		//Digite o primeiro cateto
		double cat1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o cat1:"));
		
		//Digite o segundo cateto
		double cat2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o cat2:"));
		
		//Digite o terceiro cateto
		double cat3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o cat3:"));
		
		//Cálculo da Hipotenusa
		double hypot = Math.hypot(cat1, cat2);
		
		System.out.println("Hypot: " + hypot);
		
		//O maior valor entre os catetos
		double maximo = Math.max(cat1, Math.max(cat2, cat3));
		System.out.println(maximo);
		
		for (int i = 0; i < 10; i++) 
		{
			double random = (int) (Math.random() * 10);
			System.out.println("Número aleatório: " + i + " = " + random);
		}
		
	}
}