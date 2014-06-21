package plana;
/**
 * 
 * Classe respons�vel pelo armazenamento de informa��es de uma figura plana de quatro lados.
 *
 * @author Igor Brilhante
 * @version 2.0
 */
public class Quadrilatero extends FiguraPlana
{

	/**
	 * M�todo construtor sem par�metros respons�vel po valorizar os atributos com 10.
	 */
	public Quadrilatero()
	{
		super();
	}
	
	/**
	 * M�todo construtor com dois par�metros que define valores iniciais para os atributos lado1 e lado2
	 * @param l1 Valor correspondente ao lado1 do quadril�tero
	 * @param l2 Valor correspondente ao lado2 do quadril�tero
	 */
	public Quadrilatero(int l1, int l2)
	{
		super(l1, l2);
	}
	
	/**
	 * Retorna a �rea do quadril�tero (lado 1 x lado 2)
	 * @return �rea do quadril�tero
	 */
	public double getAreaPlana() 
	{
		return super.getLado1() * super.getLado2();
	}
	
	/**
	 * Retorna o perimetro do quadril�tero (soma dos lados)
	 * @return Per�metro do quadril�tero
	 */
	public double getPerimetroPlana() 
	{
		return (2 * super.getLado1()) + (2 * super.getLado2());
	}
	
	/**
	 * Verifica se o quadril�tero � um quadrado (lados iguais), retornando true caso verdadeiro
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
	 * Verifica se o quadril�tero � um ret�ngulo (lados diferentes), retornando true caso verdadeiro
	 * @return Verdadeiro se for ret�ngulo
	 */
	public boolean isRetanguloPlana() 
	{
		return ! this.isQuadradoPlana();
	}

}
