package cigma.pfe.models;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;


@SuppressWarnings("serial")
@EqualsAndHashCode
@Embeddable
public class Facture_produit_pk implements Serializable{
	private long facture_id;
	private long produit_id;
}
