package services;

import javax.ejb.Remote;

import entities.Client;

@Remote
public interface ClientServiceRemote {
	public void ajouterClient(Client client);
}
