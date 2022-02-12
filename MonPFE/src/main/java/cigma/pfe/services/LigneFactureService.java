package cigma.pfe.services;

import cigma.pfe.models.LigneFacture;


public interface LigneFactureService {
	LigneFacture save(LigneFacture lf);
	LigneFacture update(LigneFacture lf);
//	void removeById(long id);
//	LigneFactureService findById(long idClient);
//	List<LigneFactureService> findAll(); 
}
