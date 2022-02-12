package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Clients")
@Inheritance(strategy = InheritanceType.JOINED)
/* pour @Inheritance SINGLE_TABLE ==> 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="client_type")
@DiscriminatorValue("client") */
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {

	@Id
	/* pour @Inheritance PERCLASS ==> 
	 * @GeneratedValue(strategy = GenerationType.TABLE)*/
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	@Column
	private String name;

	@OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
	private List<Facture> factures;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
			name = "client_fk",
			referencedColumnName = "id"
			),
			inverseJoinColumns = @JoinColumn(
			name = "promotion_fk",
			referencedColumnName = "id"
			))
	private List<Promotion>promotions;
	
	@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private CarteFidelio carteFidelio;
	
	@OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
	private List<Adresse> adresses;
	
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
