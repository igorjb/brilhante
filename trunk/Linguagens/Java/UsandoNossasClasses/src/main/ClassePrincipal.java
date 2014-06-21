package main;

import javax.swing.JOptionPane;

import plana.FiguraPlana;
import plana.Quadrilatero;
import plana.Triangulo;
import solida.Cubo;

//Cadastro de Quadrilatero
public class ClassePrincipal 
{
	public static void main(String[] args) 
	{
		FiguraPlana lista[] = new FiguraPlana[3];
		
		//entrada
		for (int i = 0; i < lista.length; i++)
		{
			String op = JOptionPane.showInputDialog(null, "Quadrilatero(Q) ou Triângulo(T) ");
			int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado 1"));
			int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado 2"));
			
			if(op.equalsIgnoreCase("q"))
			{
				//Quadrado: lados iguais
				Quadrilatero quad1 = new Quadrilatero();
				quad1.setLado1(lado1);
				quad1.setLado2(lado2);
				
				lista[i] = quad1;
			} else {
				int lado3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado 3"));
				Triangulo tri1 = new Triangulo();
				tri1.setLado1(lado1);
				tri1.setLado2(lado2);
				tri1.setLado3(lado3);
				
				lista[i] = tri1;
			}
			
			
		}
		
		
		
		for (int i = 0; i < lista.length; i++)
		{
			JOptionPane.showMessageDialog(null, " " + lista[i].toString());
		}
		
		FiguraPlana figMaiorArea = maiorAreaPlana(lista);
		
		if (figMaiorArea instanceof Quadrilatero)
		{
			JOptionPane.showMessageDialog(null, "Quadrilatero: " + figMaiorArea.getAreaPlana());
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Triangulo: " + figMaiorArea.getAreaPlana());
		}
		
	}
	public static FiguraPlana maiorAreaPlana(FiguraPlana lista[]) 
	{
		double maiorArea = 0;
		FiguraPlana figMaiorArea = null;
		
		for (int i = 0; i < lista.length; i++)
		{
			FiguraPlana fig = lista[i];
			
			if (fig instanceof Quadrilatero)
			{
				Quadrilatero quad = (Quadrilatero) fig;
				
				if (maiorArea < quad.getAreaPlana())
				{
					maiorArea = quad.getAreaPlana();
					figMaiorArea = quad;
				}
			}
			else 
			{
				Triangulo tri = (Triangulo) fig;
				
				if (maiorArea < tri.getAreaPlana())
				{
					maiorArea = tri.getAreaPlana();
					figMaiorArea = tri;
				}
			}
		}
		
		return figMaiorArea;
	}

}
