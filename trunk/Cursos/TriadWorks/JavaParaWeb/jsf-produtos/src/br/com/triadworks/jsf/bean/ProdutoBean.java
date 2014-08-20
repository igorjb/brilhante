package br.com.triadworks.jsf.bean;

import javax.faces.bean.ManagedBean;

import br.com.triadworks.jsf.modelo.Produto;

@ManagedBean
public class ProdutoBean 
{
	private Produto produto = new Produto();

	public Produto getProduto() {
		return produto;
	}
	
	public void grava()
	{
		System.out.println("Gravando produto no banco de dados...");
		System.out.println("Nome: " + this.produto.getNome());
		System.out.println("Descrição: " + this.produto.getDescricao());
		System.out.println("Preço: " + this.produto.getPreco());
		
		this.produto = new Produto();
	}
	
}
