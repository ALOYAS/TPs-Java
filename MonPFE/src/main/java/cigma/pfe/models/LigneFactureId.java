package cigma.pfe.models;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;


@SuppressWarnings("serial")
@EqualsAndHashCode
@Embeddable
public class LigneFactureId implements Serializable{

	private long facture_id;
	private long produit_id;
	
	public LigneFactureId(long facture_id, long produit_id) {
		super();
		this.facture_id = facture_id;
		this.produit_id = produit_id;
	}
}
