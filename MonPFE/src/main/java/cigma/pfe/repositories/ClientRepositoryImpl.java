package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import java.util.List;

import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryImpl implements ClientRepository{

//	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
//	EntityManager em=emf.createEntityManager();
	
	@PersistenceContext
	EntityManager em;

			 
	// insérer un client
	@Override
	public Client save(Client c) {
//		em.getTransaction().begin();
		em.persist(c);
//		em.getTransaction().commit();
		return null;
	}

	// modifier un client
	@Override
	public Client update(Client newClient) {
//		em.getTransaction().begin();
		Client currentClient = em.find(Client.class,newClient.getId());
		currentClient.setName(newClient.getName());
		em.persist(currentClient);
//		em.getTransaction().commit();
		return null; 
	}

	// supprimer un client
	@Override
	public void removeById(long id) {
//		em.getTransaction().begin();
		Client clientInDataBase = em.find(Client.class,id);
		em.remove(clientInDataBase);
//		em.getTransaction().commit();
	} 
	
	// afficher un client
	@Override
	public Client findById(long idClient) {
		return em.find(Client.class,idClient);
	}

	// afficher le liste des clients
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findAll() {
		Query query = em.createQuery("select c from Client c");
		return query.getResultList();
	}

	public ClientRepositoryImpl() {
	}
	
}
