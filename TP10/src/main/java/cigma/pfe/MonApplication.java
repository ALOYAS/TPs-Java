package cigma.pfe;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.LigneFactureController;
import cigma.pfe.controllers.ProduitController;
import cigma.pfe.models.Adresse;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.LigneFacture;
import cigma.pfe.models.LigneFactureId;
import cigma.pfe.models.Produit;
import cigma.pfe.models.Promotion;

public class MonApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrlC = (ClientController) context.getBean("controllerC");
	
		Client client = new Client("OMAR");
		List<Facture> factures = Arrays.asList(new Facture(new Date(),1500.0,"facture1", client),new
		Facture(new Date(),2000.0,"facture2", client));
		client.setFactures(factures);
		List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
		client.setPromotions(promotions);
		CarteFidelio carteFidelio = new CarteFidelio("A29930489");
		carteFidelio.setClient(client);
		client.setCarteFidelio(carteFidelio);
		List<Adresse> adresses = Arrays.asList(new Adresse("avenue1","ville1","pays1", client),
				new Adresse("avenue2","ville2","pays2", client));
				client.setAdresses(adresses);
		ctrlC.save(client);
		ProduitController ctrlP = (ProduitController) context.getBean("controllerP");
		Produit produit = new Produit("produit 1", 14, 100);
		ctrlP.save(produit);
		LigneFactureController ctrlLF = (LigneFactureController) context.getBean("controllerLF");
		LigneFacture ligneFacture = new LigneFacture(new LigneFactureId(1, 1), 100);
		ctrlLF.save(ligneFacture);
		ctrlLF.update(new LigneFacture(new LigneFactureId(1, 1), 110));
		((ClassPathXmlApplicationContext) context).close();
	}
	


}
