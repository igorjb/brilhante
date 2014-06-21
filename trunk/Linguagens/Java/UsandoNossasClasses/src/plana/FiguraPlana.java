package plana;

public abstract class FiguraPlana implements FiguraPlanaInterface
{
	private int lado1;
	private int lado2;
	
	public FiguraPlana() 
	{
		lado1 = 10;
		lado2 = 10;
	}

	public FiguraPlana(int lado1, int lado2) 
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	/**
	 * Método que retorna o valor armazenado do lado 1
	 * @return Valor armazenado no Lado 1
	 */
	public int getLado1() {
		return this.lado1;
	}
	
	/**
	 * Método que retorna o valor armazenado do lado 2
	 * @return Valor armazenado no Lado 2
	 */
	public int getLado2() {
		return this.lado2;
	}
	
	/**
	 * Método que fornece um valor para o lado1. Caso o valor for negativo, o valor zero será atribuído ao lado 
	 * @param l1 Valor para o Lado 1
	 */
	public void setLado1(int l1) 
	{
		if (l1 > 0)
		{
			this.lado1 = l1;
		} else {
			this.lado1 = 0;
		}
		
	}
	
	/**
	 * Método que fornece um valor para o lado2. Caso o valor for negativo, o valor zero será atribuído ao lado 
	 * @param l2 Valor para o Lado 2
	 */
	public void setLado2(int l2) 
	{
		if (l2 > 0)
		{
			this.lado2 = l2;
		} else {
			this.lado2 = 0;
		}
		
	}
	
	public String getDadosFormatados() {
		return lado1 + " - " + lado2;
	}
	
	public String toString() 
	{
		return getDadosFormatados();
	}
	
}
