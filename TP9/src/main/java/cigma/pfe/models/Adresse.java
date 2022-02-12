package cigma.pfe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String avenue;
	private String ville;
	private String pays;
	
	@ManyToOne
	@JoinColumn(name = "clint_id")
	private Client client;
	
	public Adresse(String avenue, String ville, String pays, Client client) {
		this.avenue = avenue;
		this.ville = ville;
		this.pays = pays;
		this.client = client;
	}
}
