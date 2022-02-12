package cigma.pfe.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cigma.pfe.models.Produit;

public class ProduitRepositoryImpl implements ProduitRepository{
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	
	@Override
	public Produit save(Produit p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		return null;
	}
	@Override
	public Produit update(Produit newProduit) {
		em.getTransaction().begin();
		Produit currentProduit = em.find(Produit.class,newProduit.getId());
		currentProduit.setDesignation(newProduit.getDesignation());
		currentProduit.setPrix(newProduit.getPrix());
		currentProduit.setStock(newProduit.getStock());
		em.persist(currentProduit);
		em.getTransaction().commit();
		return null;
	}
	@Override
	public void removeById(long id) {
		em.getTransaction().begin();
		Produit produitInDataBase = em.find(Produit.class, id);
		em.remove(produitInDataBase);
		em.getTransaction().commit();
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
