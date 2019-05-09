package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_client")
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="idClient")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idClient;
	private String nom;
	private String prenom;
	private String cin;
	
	
	//Associations
	@OneToMany(fetch = FetchType.EAGER, mappedBy="client" , cascade = CascadeType.ALL)
	private Set<Pret> prets;
	
	/**
	 * @return the prets
	 */
	public Set<Pret> getPrets() {
		return prets;
	}
	/**
	 * @param prets the prets to set
	 */
	public void setPrets(Set<Pret> prets) {
		this.prets = prets;
	}
	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idClient
	 * @param nom
	 * @param prenom
	 * @param cin
	 */
	public Client(String nom, String prenom, String cin) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
	}
	/**
	 * @return the idClient
	 */
	public long getIdClient() {
		return idClient;
	}
	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the cin
	 */
	public String getCin() {
		return cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	
	
}
