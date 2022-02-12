package cigma.pfe.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import cigma.pfe.models.Produit;

@Repository
public class ProduitRepositoryImpl implements ProduitRepository{
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Produit save(Produit p) {
		em.persist(p);
		return null;
	}
	
	@Override
	public Produit update(Produit newProduit) {
		Produit currentProduit = em.find(Produit.class,newProduit.getId());
		currentProduit.setDesignation(newProduit.getDesignation());
		currentProduit.setPrix(newProduit.getPrix());
		currentProduit.setStock(newProduit.getStock());
		em.persist(currentProduit);
		return null;
	}
	
	@Override
	public void removeById(long id) {
		Produit produitInDataBase = em.find(Produit.class, id);
		em.remove(produitInDataBase);
	}
	
	@Override
	public Produit findById(long idClient) {
		return em.find(Produit.class,idClient);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> findAll() {
		Query query = em.createQuery("select p from Produit p");
		return query.getResultList();
	}
	
	
}
