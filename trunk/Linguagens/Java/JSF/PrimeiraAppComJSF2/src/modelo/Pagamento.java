package modelo;

import java.io.Serializable;
import java.util.Date;

public class Pagamento implements Serializable{
	private Double valor;
	private Date data;
	
	public Pagamento(){
		data = new Date();
	}
	public Double getValor() {
		return valor;
	}
	public Date getData() {
		return data;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
