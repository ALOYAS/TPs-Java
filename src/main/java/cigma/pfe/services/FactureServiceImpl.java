package cigma.pfe.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.FactureRepository;

@Service
@Transactional
public class FactureServiceImpl implements FactureService{
	
	@Autowired
	FactureRepository factureRepository;
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();

	public FactureServiceImpl(FactureRepository factureRepository) {
		this.factureRepository = factureRepository;
	}

	@Override
	public Facture save(Facture f) {
		return factureRepository.save(f);
	}

	@Override
	public Facture update(Facture f) {
		return factureRepository.update(f);
	}

	@Override
	public void removeById(long id) {
		factureRepository.removeById(id);
		
	}

	@Override
	public Facture findById(long idClient) {
		return factureRepository.findById(idClient);
	}

	@Override
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}
	
}
