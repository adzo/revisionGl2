package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Agence;

@Stateless
@LocalBean
public class AgenceService implements AgenceRemote {

	@PersistenceContext(name="revisionGL1-ejb")
	EntityManager em;
	
	@Override
	public void ajouterAgence(Agence agence) {
		// TODO Auto-generated method stub
		em.persist(agence);
	}

}
