package cigma.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

@Controller("controllerC")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	public void setClientService(ClientService clientService) { 
		this.clientService = clientService; 
	}
	
	// insérer un client
	public Client save(Client c ){
		return clientService.save(c);
	}
	
	// modifier un client
	public void modify(Client c){
		clientService.modify(c);
	}

	// supprimer un client
	public void delete(long id){
		clientService.removeById(id);
	}

	// afficher un client
	public Client getById(long id){
		return clientService.getById(id);
	}

	// afficher le liste des clients
	public List<Client> getAll(){
		return clientService.findAll();	
	}
	
	public ClientController() {
		
	}
}
