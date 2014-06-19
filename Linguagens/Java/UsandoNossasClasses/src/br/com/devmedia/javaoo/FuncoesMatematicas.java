package br.com.devmedia.javaoo;

public class FuncoesMatematicas 
{
	//métodos estáticos podem ser chamados a qualquer momento a partir do nome da classe
	public static int getFatorial( int num) 
	{
		//5 x 4 x 3 x 2 x 1 
		
		int aux = 1;
		
		for (int i = num; i > 1; i--) 
		{
			aux = aux * i;
		}
		
		return aux;
	}
	
	public static String getBascara( double a, double b, double c) 
	{
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		return "x1=" + x1 + "x2=" + x2;
	}
	

}
