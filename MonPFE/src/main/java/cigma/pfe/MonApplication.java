package cigma.pfe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

public class MonApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		ClientController ctrl = (ClientController) context.getBean("controller"); // controller est l'id dans le fichier Spring.xml }
		Client client =new Client(1L,"testing"); 
		ctrl.save(client);

	}

}
