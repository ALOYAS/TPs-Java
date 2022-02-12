package cigma.pfe.services;

import java.util.List;

import cigma.pfe.models.Facture;

public interface FactureService {
	Facture save(Facture f);
	Facture update(Facture f);
	void removeById(long id);
	Facture findById(long idClient);
	List<Facture> findAll(); 
}
