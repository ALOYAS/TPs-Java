package cigma.pfe.controllers;

import java.util.List;
import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;

public class FactureController {

	FactureService factureService;
	
	public FactureController(FactureService factureService) {
		this.factureService = factureService;
	}
	
	public void setFactureService(FactureService factureService) {
		this.factureService = factureService;
	}
	
	public Facture save(Facture f) {
		return factureService.save(f);
	}
	
	public void update(Facture f){
		factureService.update(f);
	}

	public void delete(long id){
		factureService.removeById(id);
	}

	public Facture findById(long id){
		return factureService.findById(id);
	}

	public List<Facture> getAll(){
		return factureService.findAll();	
	}
}
