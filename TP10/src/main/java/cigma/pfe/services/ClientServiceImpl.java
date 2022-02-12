package cigma.pfe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{

	@Autowired
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
