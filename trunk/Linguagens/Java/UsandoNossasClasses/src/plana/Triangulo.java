package plana;

public class Triangulo extends FiguraPlana 
{
	private int lado3;

	
	public Triangulo() {
		super();
		lado3 = 10;
	}
	
	public Triangulo(int lado3, int lado1, int lado2 ) 
	{
		super(lado1, lado2);
		this.lado3 = lado3;
	}

	@Override
	public String getDadosFormatados() 
	{
		return super.getDadosFormatados() + " - " + this.lado3;
	}
	
	@Override
	public String toString() 
	{
		return this.getDadosFormatados();
	}
	/**
	 * @return the lado3
	 */
	public int getLado3() {
		return lado3;
	}

	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double getAreaPlana() {
		return super.getLado1() * super.getLado2() / 2;
	}

	@Override
	public double getPerimetroPlana() {
		return super.getLado1() + super.getLado2() + this.lado3;
	}
	
	public String getTipo() 
	{
		if (super.getLado1() == super.getLado2() && super.getLado2() == this.lado3)
		{
			return "Equilatero";
		}
		else if (super.getLado1() != super.getLado2() && super.getLado2() != this.lado3)
		{
			return "Escaleno";
		}
		else
		{
			return "Isosceles";
		}
	}
}
