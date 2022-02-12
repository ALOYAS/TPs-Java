package cigma.pfe.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

@Controller("controller")
public class ClientController {
	
	ClientService clientService;
	
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	public void setClientService(ClientService clientService) { 
		this.clientService = clientService; 
	}

	public Client save(Client c ){
		return clientService.save(c);
	}
	
	public void modify(Client c){
		clientService.modify(c);
	}

	public void delete(long id){
		clientService.removeById(id);
	}
	
	public Client getById(long id){
		return clientService.getById(id);
	}

	public List<Client> getAll(){
		return clientService.findAll();	
	}
	
	public ClientController() {
		
	}
}
