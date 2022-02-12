package cigma.pfe.controllers;

import org.springframework.stereotype.Controller;

import cigma.pfe.models.LigneFacture;
import cigma.pfe.services.LigneFactureService;

@Controller("controllerLF")
public class LigneFactureController {
	
	LigneFactureService ligneFactureService;
	
	public LigneFactureController(LigneFactureService ligneFactureService) {
		this.ligneFactureService = ligneFactureService;
	}
	
	public void setLigneFactureService(LigneFactureService ligneFactureService) {
		this.ligneFactureService = ligneFactureService;
	}
	public LigneFacture save(LigneFacture lf) {
		return ligneFactureService.save(lf);
	}
	public void update(LigneFacture lf){
		ligneFactureService.update(lf);
	}

}
