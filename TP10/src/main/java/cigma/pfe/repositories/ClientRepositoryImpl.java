package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryImpl implements ClientRepository{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Client save(Client c) {
		em.persist(c);
		return null;
	}

	@Override
	public Client update(Client newClient) {
		Client currentClient = em.find(Client.class,newClient.getId());
		currentClient.setName(newClient.getName());
		em.persist(currentClient);
		return null; 
	}

	@Override
	public void removeById(long id) {
		Client clientInDataBase = em.find(Client.class,id);
		em.remove(clientInDataBase);
	} 
	
	@Override
	public Client findById(long idClient) {
		return em.find(Client.class,idClient);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findAll() {
		Query query = em.createQuery("select c from Client c");
		return query.getResultList();
	}

	public ClientRepositoryImpl() {
	}
	
}
