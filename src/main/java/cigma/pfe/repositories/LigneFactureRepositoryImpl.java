package cigma.pfe.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cigma.pfe.models.LigneFacture;

@Repository
public class LigneFactureRepositoryImpl implements LigneFactureRepository{
	
//	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
//	EntityManager em=emf.createEntityManager();
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public LigneFacture save(LigneFacture lf) {
//		em.getTransaction().begin();
		em.persist(lf);
//		em.getTransaction().commit();
		return null;
	}
	@Override
	public LigneFacture update(LigneFacture newLigneFacture) {
//		em.getTransaction().begin();
		LigneFacture currentLigneFacture = em.find(LigneFacture.class,newLigneFacture.getLigneFactureId());
		currentLigneFacture.setQte(newLigneFacture.getQte());
		em.persist(currentLigneFacture);
//		em.getTransaction().commit();
		return null;
	}
}
