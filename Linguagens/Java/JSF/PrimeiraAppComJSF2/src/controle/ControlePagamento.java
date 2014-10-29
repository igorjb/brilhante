package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import modelo.Pagamento;

@ManagedBean(name="controlePagamento")
public class ControlePagamento implements Serializable{
	private Pagamento pagamento;
	private List<Pagamento> lista = new ArrayList<Pagamento>();
	
	public ControlePagamento()
	{
		pagamento = new Pagamento();
	}
	
	public String adicionarPagamento(){
		lista.add(pagamento);
		pagamento = new Pagamento();
		return "formPagamento";
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	}
	
	public List<Pagamento> getLista() {
		return lista;
	}
	
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public void setLista(List<Pagamento> lista) {
		this.lista = lista;
	}
	
	
}
