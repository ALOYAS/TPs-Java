package cigma.pfe.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Factures")
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	@Column
	private Date date;
	@Column
	private double amount;
	
	public Facture() {
	}
	
	public Facture(Date date, double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Facture [id=" + id + ", date=" + date + ", amount=" + amount + "]";
	}
	
}
