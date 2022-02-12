package cigma.pfe.services;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cigma.pfe.models.LigneFacture;
import cigma.pfe.repositories.LigneFactureRepository;

@Service
@Transactional
public class LigneFactureServiceImpl implements LigneFactureService{

	@Autowired
	LigneFactureRepository ligneFactureRepository;
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	
	public LigneFactureServiceImpl(LigneFactureRepository ligneFactureRepository) {
		this.ligneFactureRepository = ligneFactureRepository;
	}

	@Override
	public LigneFacture save(LigneFacture lf) {
		return ligneFactureRepository.save(lf);
	}

	@Override
	public LigneFacture update(LigneFacture lf) {
		return ligneFactureRepository.update(lf);
	}



}
