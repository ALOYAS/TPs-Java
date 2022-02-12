package cigma.pfe.services;

import java.util.List;

import cigma.pfe.models.Produit;

public interface ProduitService {
	Produit save(Produit p);
	Produit update(Produit p);
	void removeById(long id);
	Produit findById(long idClient);
	List<Produit> findAll(); 
}
