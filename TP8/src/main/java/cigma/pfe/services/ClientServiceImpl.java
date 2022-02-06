package cigma.pfe.services;

import java.util.List;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

public class ClientServiceImpl implements ClientService{

	ClientRepository clientRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public Client save(Client c) { 
		return clientRepository.save(c);
	}

	@Override
	public Client modify(Client c) {
		return clientRepository.update(c);
	}
	
	@Override
	public void removeById(long id) {
		clientRepository.removeById(id);
	}
	
	@Override
	public Client getById(long id) {
		return clientRepository.findById(id);
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}
	
	public ClientServiceImpl() {
	}

}
