package cigma.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cigma.pfe.models.Produit;
import cigma.pfe.services.ProduitService;

@Controller("controllerP")
public class ProduitController {
	
	@Autowired
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
