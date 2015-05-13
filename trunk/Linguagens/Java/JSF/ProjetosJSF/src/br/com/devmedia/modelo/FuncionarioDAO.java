package br.com.devmedia.modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.devmedia.beans.Funcionario;
import br.com.devmedia.jpa.EntityManagerUtil;
import br.com.devmedia.util.UtilErros;
import br.com.devmedia.util.UtilMensagens;

public class FuncionarioDAO {

	private EntityManager em;
	private String ordem = "id";
	private String filtro = "";
	private Integer maximosObjetos = 5;
	private Integer posicaoAtual = 0;
	private Integer totalObjetos = 0;
	
	public FuncionarioDAO() {
		em = EntityManagerUtil.getEntityManager();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> listarTodos() {
		return em.createQuery("from Funcionario order by nome").getResultList();
	}
	
	public boolean gravar(Funcionario obj) {
		try {
			em.getTransaction().begin();
			if (obj.getId() == null)
			{
				em.persist(obj);
			}
			else{
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
	
	public boolean excluir(Funcionario obj) {
		try {
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
			UtilMensagens.mensagemInformacao("Objeto removido com sucesso!");
			return true;
		} catch (Exception e) {
			if (em.getTransaction().isActive() == false){
				em.getTransaction().begin();
			}
			em.getTransaction().rollback();
			UtilMensagens.mensagemErro("Erro ao remover objeto: " + UtilErros.getMenssagemErro(e));
			return false;
		}
	}

	public Funcionario localizar(Integer id) {
		return em.find(Funcionario.class, id);
	}
	
	public boolean login(String usuario, String senha) {
		Query query = em.createQuery("from Funcionario where upper(nomeUsuario) = :usuario "
				+ "and upper(senha) = :senha and ativo = true");
		query.setParameter("usuario", usuario.toUpperCase());
		query.setParameter("senha", senha.toUpperCase());
		if (!query.getResultList().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Funcionario localizarPorNome(String usuario) {
		return (Funcionario) em.createQuery("from Funcionario where upper(nomeUsuario) = "
				+ ":usuario").setParameter("usuario", usuario.toUpperCase()).getSingleResult();
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
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> listar() {
		String where = "";
		String jpql = null;
		if (filtro.length() > 0)
		{
			if(ordem.equals("id"))
			{
				try {
					Integer.parseInt(filtro);
					where = " where " + ordem + " = '" + filtro + "' ";
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			} else {
				if (ordem.equals("grupo"))
				{
					
				}
				else if (ordem.equals("setor"))
				{
					
				}
				else
				{
					where = " where upper("+ordem+") like '"+filtro.toUpperCase()+"%' ";
				}
				
			}
		} 
		

		
		if (ordem.equals("grupo"))
		{
			jpql = "select f from Funcionario f, Grupo g where f.grupo = g.id and g.nome like '"+filtro.toUpperCase()+"%' ";
			totalObjetos = em.createQuery(jpql).getResultList().size();
			posicaoAtual = 0;
			maximosObjetos = totalObjetos;

		}
		else if (ordem.equals("setor"))
		{
			jpql = "select f from Funcionario f, Setor s where f.setor = s.id and s.nome like '"+filtro.toUpperCase()+"%' ";
			totalObjetos = em.createQuery(jpql).getResultList().size();
			posicaoAtual = 0;
			maximosObjetos = totalObjetos;
		}
		else
		{
			totalObjetos = em.createQuery("select id from Funcionario f " + where +
					 "order by "+ordem).getResultList().size();
			jpql = "from Funcionario " + where + " order by " + ordem;
		}
	
		return em.createQuery(jpql).
			   setFirstResult(posicaoAtual).
			   setMaxResults(maximosObjetos).getResultList();
	}
	public void primeiro() {
		posicaoAtual = 0;
	}
	
	public void anterior() {
		posicaoAtual -= maximosObjetos;
		
		if (posicaoAtual < 0) {
			posicaoAtual = 0;
		}
	}
	
	public void proximo() {
		if (posicaoAtual + maximosObjetos < totalObjetos)
		{
			posicaoAtual += maximosObjetos;
		}
	}
	
	public void ultimo() {
		int resto = totalObjetos % maximosObjetos;
		if (resto > 0) {
			posicaoAtual = totalObjetos - resto;
		} else {
			posicaoAtual = totalObjetos - maximosObjetos;
		}
	}
	
	public String getMensagemNavegacao() {
		int ate = posicaoAtual + maximosObjetos;
		if (ate > totalObjetos)
		{
			ate = totalObjetos;
		}
		return "Listando de " + (posicaoAtual + 1)+
				" até " + ate + " de " + totalObjetos + " registros";
	}
}
