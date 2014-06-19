package solida;

import plana.Quadrilatero;

public class Cubo extends Quadrilatero
{
	private int altura;
	
	//Construtores
	
	//Sem parâmetro
	public Cubo() 
	{
		super();
		this.altura = 10;
	}
	
	//Com parâmetro
	public Cubo(int lado1, int lado2) 
	{
		super(lado1, lado2);
		this.altura = 10;
	}
	
	public Cubo(int lado1, int lado2, int altura) 
	{
		super(lado1, lado2);
		this.altura = altura;
	}
	
	
	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}

}
