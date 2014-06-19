package plana;

public class Quadrilatero 
{
	private int lado1;
	private int lado2;
	
	//Construtores
	
	//Sem parâmetros
	public Quadrilatero()
	{
		this.lado1 = 10;
		this.lado2 = 10;
	}
	
	//Com parâmetros
	public Quadrilatero(int l1, int l2)
	{
		this.lado1 = l1;
		this.lado2 = l2;
	}
	
	
	public int getLado1() {
		return this.lado1;
	}
	public int getLado2() {
		return this.lado2;
	}
	
	public void setLado1(int l1) 
	{
		if (l1 > 0)
		{
			this.lado1 = l1;
		} else {
			this.lado1 = 0;
		}
		
	}
	public void setLado2(int l2) 
	{
		if (l2 > 0)
		{
			this.lado2 = l2;
		} else {
			this.lado2 = 0;
		}
		
	}
	
	public String getDadosFormatados()
	{
		return this.lado1 + " - " + this.lado2;
	}
	
	public String toString() 
	{
		return this.getDadosFormatados();
	}
	
	public double getAreaPlana() 
	{
		return this.lado1 * this.lado2;
	}
	
	public double getPerimetroPlana() 
	{
		return 2 * this.lado1 + 2 * this.lado2;
	}
	
	public boolean isQuadradoPlana() 
	{
		if (this.lado1 == this.lado2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isRetanguloPlana() 
	{
		return ! this.isQuadradoPlana();
	}

}
