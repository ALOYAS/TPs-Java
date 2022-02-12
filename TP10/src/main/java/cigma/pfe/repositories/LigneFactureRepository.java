package cigma.pfe.repositories;

import cigma.pfe.models.LigneFacture;

public interface LigneFactureRepository {
	LigneFacture save(LigneFacture lf);
	LigneFacture update(LigneFacture lf);
}
