package cigma.pfe.repositories;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import cigma.pfe.models.Facture;

@Repository
public class FactureRepositoryImpl implements FactureRepository{
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Facture save(Facture f) {
		em.persist(f);
		return null;
	}

	@Override
	public Facture update(Facture newFacture) {
		Facture currentFacture = em.find(Facture.class,newFacture.getId());
		currentFacture.setDate(newFacture.getDate());
		currentFacture.setAmount(newFacture.getAmount());
		em.persist(currentFacture);
		return null;
	}


	@Override
	public void removeById(long id) {
		Facture factureInDataBase = em.find(Facture.class, id);
		em.remove(factureInDataBase);
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
