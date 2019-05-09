package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Client;

@Stateless
@LocalBean
public class ClientService implements ClientServiceRemote {

	@PersistenceContext(name="revisionGL1-ejb")
	EntityManager em;
	
	
	@Override
	public void ajouterClient(Client client) {
		// TODO Auto-generated method stub
		em.persist(client);
	}

	
}
