package cigma.pfe.controllers;

import java.util.List;

import cigma.pfe.models.Produit;
import cigma.pfe.services.ProduitService;

public class ProduitController {
	
	ProduitService produitService;
	
	public ProduitController(ProduitService produitService) {
		this.produitService = produitService;
	}
	
	public void setProduitService(ProduitService produitService) {
		this.produitService = produitService;
	}
	
	public Produit save(Produit p) {
		return produitService.save(p);
	}
	public void update(Produit p){
		produitService.update(p);
	}

	public void delete(long id){
		produitService.removeById(id);
	}

	public Produit findById(long id){
		return produitService.findById(id);
	}

	public List<Produit> getAll(){
		return produitService.findAll();	
	}
}
