package cigma.pfe.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import cigma.pfe.models.LigneFacture;

@Repository
public class LigneFactureRepositoryImpl implements LigneFactureRepository{
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public LigneFacture save(LigneFacture lf) {
		em.persist(lf);
		return null;
	}
	@Override
	public LigneFacture update(LigneFacture newLigneFacture) {
		LigneFacture currentLigneFacture = em.find(LigneFacture.class,newLigneFacture.getLigneFactureId());
		currentLigneFacture.setQte(newLigneFacture.getQte());
		em.persist(currentLigneFacture);
		return null;
	}
}
