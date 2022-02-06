package cigma.pfe;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

public class MonApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("controller"); // controller est l'id dans le fichier Spring.xml }

		ctrl.save(new Client("OMAR"));
		ctrl.save(new Client("SIHAM"));
		ctrl.save(new Client("AHMED"));
		ctrl.save(new Client("FARAH"));	
		
		ctrl.modify(new Client(2,"hanan"));
	
		ctrl.delete(1);
		ctrl.delete(3);
		
		Client found = ctrl.getById(4);
		System.out.println(found.toString()); 
		
		List<Client> clients = ctrl.getAll();
		for(Client clt : clients)
			System.out.println("Client Id => " + clt.getId() + " / Client name => " + clt.getName());
		
		
		FactureController ctrlF = (FactureController) context.getBean("controllerF");		
		
		ctrlF.save(new Facture(new Date(),10));
		ctrlF.save(new Facture(new Date(),20));
		ctrlF.save(new Facture(new Date(),30));
		
		ctrlF.update(new Facture(1,new Date(),177));
		
		ctrlF.delete(2);
		
		Facture f1 = ctrlF.findById(3);
		
		System.out.println(f1.toString());
		List<Facture> factures = ctrlF.getAll();
		for(Facture clt : factures)
			System.out.println("Facture Id => " + clt.getId() + " / Facture date => " + clt.getDate() + " / Facture amount => " + clt.getAmount());

		((ClassPathXmlApplicationContext) context).close();
	}
	
}
