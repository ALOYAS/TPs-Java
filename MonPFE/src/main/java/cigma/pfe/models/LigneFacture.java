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
	private LigneFactureId ligneFactureId;
	private long qte;
	
	public LigneFacture(LigneFactureId ligneFactureId, long qte) {
		super();
		this.ligneFactureId = ligneFactureId;
		this.qte = qte;
	}
}
