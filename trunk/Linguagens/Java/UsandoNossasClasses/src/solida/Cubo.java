package solida;

import plana.Quadrilatero;
/**
 * Classe responsável pelo armazenamento de informações de uma figura solida com seis faces (cubo).
 * 
 * 
 * @author Igor Brilhante
 * @version 2.0
 */
public class Cubo extends Quadrilatero
{
	private int altura;
	
	/**
	 * Método construtor sem parâmetros responsável por valorizar os atributos com 10.
	 */
	public Cubo() 
	{
		super();
		this.altura = 10;
	}
	
	/**
	 * Método construtor com dois parâmetros que define valores iniciais para os atributos lado1 e lado2. O atributo altura inicia com valor 10.
	 * @param lado1 Valor correspondente ao lado1 do Cubo
	 * @param lado2 Valor correspondente ao lado2 do Cubo
	 */
	public Cubo(int lado1, int lado2) 
	{
		super(lado1, lado2);
		this.altura = 10;
	}
	
	/**
	 * Método construtor com parâmetros que define valores iniciais para os atributos lado1 e lado2 e altura
	 * @param lado1 Valor correspondente ao lado1 do Cubo
	 * @param lado2 Valor correspondente ao lado2 do Cubo
	 * @param altura Valor correspondente a altura do Cubo
	 */
	public Cubo(int lado1, int lado2, int altura) 
	{
		super(lado1, lado2);
		this.altura = altura;
	}
	
	/**
	 * Método que retorna o valor armazenado na altura
	 * @return Valor armazenado na altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Método que fornece um valor para a altura.
	 * @param altura Valor para a altura 
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	/**
	 * Retorna uma representação textual para o objeto cubo, sendo este formado pelo lado1 - lado2 - altura
	 * @return Representação Textual
	 */
	
	@Override
	public String getDadosFormatados() 
	{
		return super.getDadosFormatados() + " - " + this.getAltura();
	}
	
	/**
	 * Retorna uma representação textual para o objeto cubo, sendo este formado pelo lado1 - lado2 - altura
	 * @return Representação Textual
	 */
	@Override
	public String toString()
	{
		return this.getDadosFormatados();
	}
	
	/**
	 * Retorna o volume do cubo (lado 1 x lado 2 x altura)
	 * @return Volume do Cubo
	 */
	public double getVolume() 
	{
		return super.getLado1() * super.getLado2() * this.altura;
	}
	
	/**
	 * Verifica se o cubo é perfeito, ou seja, todos os lados iguais.
	 * @return Verdadeiro se o cubo é perfeito
	 */
	public boolean isCuboPerfeito() 
	{
		if (super.getLado1() == super.getLado2() && 
				super.getLado2() == this.getAltura())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
