package plana;
/**
 * 
 * Classe responsável pelo armazenamento de informações de uma figura plana de quatro lados.
 *
 * @author Igor Brilhante
 * @version 2.0
 */
public class Quadrilatero extends FiguraPlana
{

	/**
	 * Método construtor sem parâmetros responsável po valorizar os atributos com 10.
	 */
	public Quadrilatero()
	{
		super();
	}
	
	/**
	 * Método construtor com dois parâmetros que define valores iniciais para os atributos lado1 e lado2
	 * @param l1 Valor correspondente ao lado1 do quadrilátero
	 * @param l2 Valor correspondente ao lado2 do quadrilátero
	 */
	public Quadrilatero(int l1, int l2)
	{
		super(l1, l2);
	}
	
	/**
	 * Retorna a área do quadrilátero (lado 1 x lado 2)
	 * @return Área do quadrilátero
	 */
	public double getAreaPlana() 
	{
		return super.getLado1() * super.getLado2();
	}
	
	/**
	 * Retorna o perimetro do quadrilátero (soma dos lados)
	 * @return Perímetro do quadrilátero
	 */
	public double getPerimetroPlana() 
	{
		return (2 * super.getLado1()) + (2 * super.getLado2());
	}
	
	/**
	 * Verifica se o quadrilátero é um quadrado (lados iguais), retornando true caso verdadeiro
	 * @return Verdadeiro se for quadrado
	 */
	public boolean isQuadradoPlana() 
	{
		if (super.getLado1() == super.getLado2())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Verifica se o quadrilátero é um retângulo (lados diferentes), retornando true caso verdadeiro
	 * @return Verdadeiro se for retângulo
	 */
	public boolean isRetanguloPlana() 
	{
		return ! this.isQuadradoPlana();
	}

}
