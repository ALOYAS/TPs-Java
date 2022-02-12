package cigma.pfe.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Produit {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String designation;
	private float prix;
	private long stock; 

//	@ManyToMany
//	@JoinTable(
//			  name = "LigneFacture", 
//			  joinColumns = @JoinColumn(name = "facture_id"), 
//			  inverseJoinColumns = @JoinColumn(name = "produit_id"))
//  private List<Facture>factures;
	
	@OneToMany(mappedBy = "ligneFactureId.produit_id")
	private List<LigneFacture>lignefacture;
	
	public Produit(String designation, float prix, long stock) {
		this.designation = designation;
		this.prix = prix;
		this.stock = stock;
	}

}
