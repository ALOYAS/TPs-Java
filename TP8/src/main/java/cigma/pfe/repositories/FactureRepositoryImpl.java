package cigma.pfe.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import cigma.pfe.models.Facture;

public class FactureRepositoryImpl implements FactureRepository{
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	
	@Override
	public Facture save(Facture f) {
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		return null;
	}

	@Override
	public Facture update(Facture newFacture) {
		em.getTransaction().begin();
		Facture currentFacture = em.find(Facture.class,newFacture.getId());
		currentFacture.setDate(newFacture.getDate());
		currentFacture.setAmount(newFacture.getAmount());
		em.persist(currentFacture);
		em.getTransaction().commit();
		return null;
	}


	@Override
	public void removeById(long id) {
		em.getTransaction().begin();
		Facture factureInDataBase = em.find(Facture.class, id);
		em.remove(factureInDataBase);
		em.getTransaction().commit();
	}


	@Override
	public Facture findById(long idClient) {
		return em.find(Facture.class,idClient);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Facture> findAll() {
		Query query = em.createQuery("select f from Facture f");
		return query.getResultList();
	}
}
