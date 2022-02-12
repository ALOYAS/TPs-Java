package cigma.pfe.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class LigneFacture {
	@EmbeddedId
	private Facture_produit_pk facture_produit_pk;
	private long qte;
}
