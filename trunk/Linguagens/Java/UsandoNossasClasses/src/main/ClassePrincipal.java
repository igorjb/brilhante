package main;

import javax.swing.JOptionPane;

import plana.Quadrilatero;

//Cadastro de Quadrilatero
public class ClassePrincipal 
{
	public static void main(String[] args) 
	{
		//entrada
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado 1 do Quadrilatero 1"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado 2 do Quadrilatero 1"));
		
		//Quadrado: lados iguais
		Quadrilatero quad1 = new Quadrilatero();
		quad1.setLado1(lado1);
		quad1.setLado2(lado2);
		
		//Retângulo: lados diferentes
		Quadrilatero quad2 = new Quadrilatero();
		quad2.setLado1(2);
		quad2.setLado2(4);
		
		//processamentos
		
		//saida
		System.out.println("Quadrilatero 1: " + quad1.getLado1() + " - " + quad1.getLado2());
		System.out.println("Quadrilatero 2: " + quad2.getLado1() + " - " + quad2.getLado2());

	}

}
