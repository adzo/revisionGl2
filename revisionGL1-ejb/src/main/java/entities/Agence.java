package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Agence
 *
 */
@Entity
@Table(name="t_agences")
public class Agence implements Serializable {

	   
	@Id
	@Column(name="idAgence")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAgence;
	private String adresse;
	private static final long serialVersionUID = 1L;

	//Assocations
	@OneToMany(fetch = FetchType.EAGER, mappedBy="agence" , cascade = CascadeType.ALL)
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

	public Agence() {
		super();
	}   
	
	/**
	 * @param idAgence
	 * @param adresse
	 */
	public Agence(String adresse) {
		super();
		
		this.adresse = adresse;
	}

	public long getIdAgence() {
		return this.idAgence;
	}

	public void setIdAgence(long idAgence) {
		this.idAgence = idAgence;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
   
}
