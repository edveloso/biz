package br.edu.infnet.bizWeb.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class ChamadoDao   {
	
	@PersistenceContext
	private EntityManager em;
	
	public void persiste(Chamado chamado){
		em.persist(chamado);
	}
	
	public List<Chamado> getAll(){
		return em.createQuery("select c from Chamado c").getResultList();
	}
	

}
