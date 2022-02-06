package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	@Column
	private String name;
	
	public Client() {
	}
	
	public Client(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Client{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}