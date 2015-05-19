package br.com.devmedia.modelo;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.devmedia.beans.Projeto;
import br.com.devmedia.jpa.EntityManagerUtil;
import br.com.devmedia.util.UtilErros;
import br.com.devmedia.util.UtilMensagens;

public class ProjetoDAO {

	private EntityManager em;
	private String ordem = "id";
	private String filtro = "";
	private Integer maximosObjetos = 2;
	private Integer posicaoAtual = 0;
	private Integer totalObjetos = 0;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public ProjetoDAO() {
		em = EntityManagerUtil.getEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<Projeto> listar() {
		String where = "";
		String jpql = null;
		if (filtro.length() > 0)
		{
			if (ordem.equals("id"))
			{
				try {
					Integer.parseInt(filtro);
					where = " where " + ordem + " = '" + filtro + "' ";
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else {
				where = " where upper("+ordem+") like '"+filtro.toUpperCase()+ "%' ";
			}
		}
		
		if (ordem.equals("setor"))
		{
			jpql = "select p from Projeto p, Setor s where p.setor = s.id and s.nome like '"+filtro.toUpperCase()+"%' ";
			totalObjetos = em.createQuery(jpql).getResultList().size();
			posicaoAtual = 0;
			maximosObjetos = totalObjetos;
		}
		else
		{
			jpql = "from Projeto " + where + " order by " + ordem;
			totalObjetos = em.createQuery("select id from Projeto " + where + " order by "+ ordem).getResultList().size();
		}
		
		
		return em.createQuery(jpql).setFirstResult(posicaoAtual).setMaxResults(maximosObjetos).getResultList();
	}
	
	public void primeiro() {
		posicaoAtual = 0;
	}
	
	public void anterior() {
		posicaoAtual -= maximosObjetos;
		if (posicaoAtual < 0){
			posicaoAtual = 0;
		}
	}
	
	public void proximo() {
		if (posicaoAtual + maximosObjetos < totalObjetos){
			posicaoAtual += maximosObjetos;
		}
	}
	
	public void ultimo() {
		int resto = totalObjetos % maximosObjetos;
		
		if (resto > 0){
			posicaoAtual = totalObjetos - resto;
		}else{
			posicaoAtual = totalObjetos - maximosObjetos;
		}
	}
	
	public String getMensagemNavegacao() {
		int ate = posicaoAtual + maximosObjetos;
		if (ate > totalObjetos){
			ate = totalObjetos;
		}
		
		return "Listando de " + (posicaoAtual + 1) + 
				"até " + ate + " de " + totalObjetos + " registros";
	}
	@SuppressWarnings("unchecked")
	public List<Projeto> listarTodos() {
		return em.createQuery("from Projeto order by nome").getResultList();
	}
	
	public boolean gravar(Projeto obj) {
		try {
			em.getTransaction().begin();
			if (obj.getId() == null) {
				em.persist(obj);
			} else {
				em.merge(obj);
			}
			em.getTransaction().commit();
			UtilMensagens.mensagemInformacao("Objeto persistido com sucesso!");
			return true;
		} catch (Exception e) {
			if (em.getTransaction().isActive() == false) {
				em.getTransaction().begin();
			}
			em.getTransaction().rollback();
			UtilMensagens.mensagemErro("Erro ao persistir objeto: " + UtilErros.getMenssagemErro(e));
			return false;
		}
	}
	
	public boolean excluir(Projeto obj) {
		try {
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
			UtilMensagens.mensagemInformacao("Objeto removido com sucesso!");
			return true;
		} catch (Exception e) {
			if (em.getTransaction().isActive() == false) {
				em.getTransaction().begin();
			}
			em.getTransaction().rollback();
			UtilMensagens.mensagemErro("Erro ao remover objeto: " + UtilErros.getMenssagemErro(e));
			return false;
		}
	}
	
	public Projeto localizar(Integer id) {
		return em.find(Projeto.class, id);
	}
	
	public void roolback() {
		if (em.getTransaction().isActive() == false) {
			em.getTransaction().begin();
		}
		em.getTransaction().rollback();
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	public Integer getMaximosObjetos() {
		return maximosObjetos;
	}

	public void setMaximosObjetos(Integer maximosObjetos) {
		this.maximosObjetos = maximosObjetos;
	}

	public Integer getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Integer posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	public Integer getTotalObjetos() {
		return totalObjetos;
	}

	public void setTotalObjetos(Integer totalObjetos) {
		this.totalObjetos = totalObjetos;
	}
	
	
}
