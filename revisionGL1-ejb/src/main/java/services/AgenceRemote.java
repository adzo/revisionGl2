package services;

import javax.ejb.Remote;

import entities.Agence;

@Remote
public interface AgenceRemote {
	public void ajouterAgence(Agence agence);
}
