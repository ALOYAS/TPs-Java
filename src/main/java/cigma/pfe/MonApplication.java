package cigma.pfe;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.LigneFactureController;
import cigma.pfe.controllers.ProduitController;
//import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Adresse;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.LigneFacture;
import cigma.pfe.models.LigneFactureId;
import cigma.pfe.models.Produit;
//import cigma.pfe.models.Produit;
import cigma.pfe.models.Promotion;

public class MonApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		ClientController ctrl = (ClientController) context.getBean("controllerC"); // controller est l'id dans le fichier Spring.xml }
//		Client client =new Client(1L,"testing"); 
//		Client client =new Client("test");
//		ctrl.save(client);
	
		Client client = new Client("OMAR");
		// pour tester Facture
		List<Facture> factures = Arrays.asList(new Facture(new Date(),1500.0,"facture1", client),new
		Facture(new Date(),2000.0,"facture2", client));
		client.setFactures(factures);
		// pour tester Promotion
		List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
		client.setPromotions(promotions);
		// pour tester CarteFidelio
		CarteFidelio carteFidelio = new CarteFidelio("A29930489");
		carteFidelio.setClient(client);
		client.setCarteFidelio(carteFidelio);
		// pour tester adresse		
		List<Adresse> adresses = Arrays.asList(new Adresse("avenue1","ville1","pays1", client),
				new Adresse("avenue2","ville2","pays2", client));
				client.setAdresses(adresses);
//		List<Produit> produits = Arrays.asList(new Produit("produit1",10,100),new Produit("produit2",12,55));
		ctrl.save(client);
		ProduitController ctrlp = (ProduitController) context.getBean("controllerP");
		Produit produit = new Produit("produit 1", 15, 55);
		ctrlp.save(produit);
		LigneFactureController ctrllf = (LigneFactureController) context.getBean("controllerLF");
		LigneFacture ligneFacture = new LigneFacture(new LigneFactureId(1, 1), 100);
		ctrllf.save(ligneFacture);
		
//		FactureController ctrlF = (FactureController) context.getBean("controllerF");		
//		ctrlF.save(new Facture(new Date(),10));
//		ctrlF.save(new Facture(new Date(),20));
//		ctrlF.save(new Facture(new Date(),30));
//		ctrlF.update(new Facture(1,new Date(),177));
//		ctrlF.delete(2);
//		Facture f1 = ctrlF.findById(3);
//		System.out.println(f1.toString());
//		List<Facture> factures = ctrlF.getAll();
//		for(Facture clt : factures)
//			System.out.println("Facture Id => " + clt.getId() + " / Facture date => " + clt.getDate() + " / Facture amount => " + clt.getAmount());
		
//		ctrl.save(new Client("OMAR"));
//		ctrl.save(new Client("SIHAM"));
//		ctrl.save(new Client("AHMED"));
//		ctrl.save(new Client("FARAH"));
		
//		ctrl.modify(new Client(2,"hanan"));
		
//		ctrl.delete(1);
//		ctrl.delete(3);
		
//		Client found = ctrl.getById(4);
//		System.out.println(found.toString()); 
//		
//		List<Client> clients = ctrl.getAll();
//		for(Client clt : clients)
//			System.out.println("Client Id => " + clt.getId() + " / Client name => " + clt.getName());
//		
		((ClassPathXmlApplicationContext) context).close();
	}
	


}
