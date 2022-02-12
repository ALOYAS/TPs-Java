package cigma.pfe.services;

import java.util.List;

import cigma.pfe.models.Client;

public interface ClientService {
	
	Client save(Client c);
	Client modify(Client c);
	void removeById(long id);
	Client getById(long id);
	List<Client> findAll(); 
}
