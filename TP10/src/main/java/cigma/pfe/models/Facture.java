package cigma.pfe.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Factures")
public class Facture {

	public Facture(long id, Date date, double amount, String description, Client client) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.description = description;
		this.client = client;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	@Column
	private Date date;
	@Column
	private double amount;
	@Column
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@ManyToMany(mappedBy = "factures")
	private List<Produit>produits;
	
	
	public Facture() {
	}
	
	public Facture(Date date, double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	public Facture(Date date, double amount, String description) {
		this.date = date;
		this.amount = amount;
		this.description = description;
	}
	

	public Facture(Date date, double amount, String description, Client client) {
		this.date = date; this.amount = amount; this.description = description;
		this.client = client;
	}
	
	public Facture(Date date, double amount, String description, Client client,List<Produit> produits) { 
		this.date = date; this.amount = amount;
		this.description = description; this.client = client; this.produits = produits; 	
	}
	
	@Override
	public String toString() {
		return "Facture [id=" + id + ", date=" + date + ", amount=" + amount + "]";
	}
	
}
