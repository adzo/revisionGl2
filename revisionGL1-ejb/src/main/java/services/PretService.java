package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Client;
import entities.Pret;

@Stateless
@LocalBean
public class PretService implements PretServiceRemote {

	@PersistenceContext(name = "revisionGL1-ejb")
	EntityManager em;

	@Override
	public void ajouterPret(Pret pret) {
		// TODO Auto-generated method stub
		em.persist(pret);
	}

	@Override
	public void affecterClientPret(long idPret, long idClient) {
		// TODO Auto-generated method stub
		Client client = em.find(Client.class, idClient);
		Pret pret = em.find(Pret.class, idPret);
		pret.setClient(client);
	}

	@Override
	public List<Pret> getPretsParClient(long idClient) {
		// TODO Auto-generated method stub
		Client client = em.find(Client.class, idClient);
		List<Pret> result = new ArrayList<Pret>();
		for (Pret pret : client.getPrets()) {
			result.add(pret);
		}
		
		return result;
//		List<Pret> result = em.createQuery("SELECT e FROM PRET e WHERE e.client.idClient = :idClient",Pret.class).getResultList();
//		
//		return null;
	}

}
