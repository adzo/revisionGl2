package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pret
 *
 */
@Entity

public class Pret implements Serializable {

	   
	@Id
	@Column(name="idPret")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPret;
	private double montant;
	private double taux;
	
	private TypePret typePret;
	private static final long serialVersionUID = 1L;

	public Pret() {
		super();
	}   
	
	
	/**
	 * @param montant
	 * @param taux
	 * @param typePret
	 */
	public Pret(double montant, double taux, TypePret typePret) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.typePret = typePret;
	}


	//Associations
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="FK_CLIENT_PRET")
	private Client client;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="FK_AGENCE_PRET")
	private Agence agence;
	
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the agence
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * @param agence the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	/**
	 * @param idPret
	 * @param montant
	 * @param taux
	 * @param typePret
	 */
	public Pret(long idPret, double montant, double taux, TypePret typePret) {
		super();
		this.idPret = idPret;
		this.montant = montant;
		this.taux = taux;
		this.typePret = typePret;
	}

	public long getIdPret() {
		return this.idPret;
	}

	public void setIdPret(long idPret) {
		this.idPret = idPret;
	}   
	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}   
	public double getTaux() {
		return this.taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}   
	public TypePret getTypePret() {
		return this.typePret;
	}

	public void setTypePret(TypePret typePret) {
		this.typePret = typePret;
	}
   
}
