package cigma.pfe.repositories;

import java.util.List;

import cigma.pfe.models.Client;

public interface ClientRepository{
	
	 Client save(Client c);
	 Client update(Client c);
	 void removeById(long id);
	 Client findById(long idClient);
	 List<Client> findAll(); 
}
