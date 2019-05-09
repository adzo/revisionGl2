package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Pret;

@Remote
public interface PretServiceRemote {

	public void ajouterPret(Pret pret);
	public void affecterClientPret(long idPret, long idClient);
	public List<Pret> getPretsParClient(long idClient);
}
