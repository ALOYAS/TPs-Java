package cigma.pfe.models;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
/* pour @Inheritance JOINED ==> */
@PrimaryKeyJoinColumn(name="vip_id") 
/* pour @Inheritance SINGLE_TABLE ==> 
@DiscriminatorValue("vip")*/
public class ClientVip extends Client{
	
	private String preferences;
	public ClientVip(String name, String preferences) {
		super(name);
		this.preferences = preferences;
	}
	
}
