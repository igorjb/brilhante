package br.com.devmedia.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.devmedia.conversores.ConverterOrdem;
import br.com.devmedia.util.UtilErros;
import br.com.devmedia.util.UtilMensagens;

@SuppressWarnings("serial")
public class GenericDAO<T> implements Serializable{
	
	private Class classe;
	private EntityManager em;
	private String filtro = "";
	private List<Ordem> listaOrdem = new ArrayList<Ordem>();
	private Ordem ordemAtual;
	private int maximoObjetos = 10;
	private int posicao = 0;
	private int totalObjetos = 0;
	private ConverterOrdem converterOrdem;
	
	public void iniciarTransacao() {
		if (em.getTransaction().isActive() == false) {
			em.getTransaction().begin();
		}
	}
	
	public void rollbackTransacao() {
		iniciarTransacao();
		em.getTransaction().rollback();
	}
	
	public void commitTransacao() {
		iniciarTransacao();
		em.getTransaction().commit();
	}
	
	public boolean persist(T objeto) {
		try {
			iniciarTransacao();
			em.persist(objeto);
			commitTransacao();
			UtilMensagens.mensagemInformacao("Objeto persistido com sucesso");
			return true;
		} catch (Exception e) {
			rollbackTransacao();
			UtilMensagens.mensagemErro("Erro ao persistir objeto: " + UtilErros.getMenssagemErro(e));
			return false;
		}
	}
	
	public boolean merge(T objeto) {
		try {
			iniciarTransacao();
			em.merge(objeto);
			commitTransacao();
			UtilMensagens.mensagemInformacao("Objeto persistido com sucesso");
			return true;
		} catch (Exception e) {
			rollbackTransacao();
			UtilMensagens.mensagemErro("Erro ao persistir objeto: " + UtilErros.getMenssagemErro(e));
			return false;
		}
	}
	
	public boolean remove(T objeto) {
		try {
			iniciarTransacao();
			em.remove(objeto);
			commitTransacao();
			UtilMensagens.mensagemInformacao("Objeto removido com sucesso");
			return true;
		} catch (Exception e) {
			rollbackTransacao();
			UtilMensagens.mensagemErro("Erro ao remover objeto: "+UtilErros.getMenssagemErro(e));
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listarTodos() {
		String jpql = "from " + classe.getSimpleName();
		if (ordemAtual != null){
			jpql += " order by " + ordemAtual.getAtributo();
		}
		return em.createQuery(jpql).getResultList();
	
	}
	public Class getClasse() {
		return classe;
	}
	public void setClasse(Class classe) {
		this.classe = classe;
	}
	public EntityManager getEm() {
		return em;
	}
	public void setEm(EntityManager em) {
		this.em = em;
	}
	public String getFiltro() {
		return filtro;
	}
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	public List<Ordem> getListaOrdem() {
		return listaOrdem;
	}
	public void setListaOrdem(List<Ordem> listaOrdem) {
		this.listaOrdem = listaOrdem;
	}
	public Ordem getOrdemAtual() {
		return ordemAtual;
	}
	public void setOrdemAtual(Ordem ordemAtual) {
		this.ordemAtual = ordemAtual;
	}
	public int getMaximoObjetos() {
		return maximoObjetos;
	}
	public void setMaximoObjetos(int maximoObjetos) {
		this.maximoObjetos = maximoObjetos;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public int getTotalObjetos() {
		return totalObjetos;
	}
	public void setTotalObjetos(int totalObjetos) {
		this.totalObjetos = totalObjetos;
	}
	public ConverterOrdem getConverterOrdem() {
		return converterOrdem;
	}
	public void setConverterOrdem(ConverterOrdem converterOrdem) {
		this.converterOrdem = converterOrdem;
	}
	
	
	
}
 