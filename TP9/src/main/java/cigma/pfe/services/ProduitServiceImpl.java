package cigma.pfe.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.Produit;
import cigma.pfe.repositories.ProduitRepository;

public class ProduitServiceImpl implements ProduitService{

	ProduitRepository produitRepository;
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	
	public ProduitServiceImpl(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	@Override
	public Produit save(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public Produit update(Produit p) {
		return produitRepository.update(p);
	}

	@Override
	public void removeById(long id) {
		produitRepository.removeById(id);
	}

	@Override
	public Produit findById(long idClient) {
		return produitRepository.findById(idClient);
	}

	@Override
	public List<Produit> findAll() {
		return produitRepository.findAll();
	}
	
	
}