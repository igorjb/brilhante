package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="controleBonus")
@SessionScoped
public class ControleBonus implements Serializable  
{
	private String nome;
	private Double salario;
	private Double bonus;
	private Integer cargo;
	
	public ControleBonus() {
		
	}
	
	public String calcula() 
	{
		System.out.println(salario);
		System.out.println(nome);
		switch (cargo) {
		case 0:
			bonus = salario * 15 / 100;
			break;
		case 1:
			bonus = salario * 10 / 100;
			break;
		case 2:
			bonus = salario * 10 / 100;
			break;
		}
		return "dadosBonus"; 
	}
	
	public String dadosBonus(){
		return "dadosBonus?c="+cargo+"&n="+nome+"&s="+salario+"&faces-redirect=true";
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	public Double getBonus() {
		return bonus;
	}
	public Integer getCargo() {
		return cargo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	public void setCargo(Integer cargo) {
		this.cargo = cargo;
	}
	
	
}
