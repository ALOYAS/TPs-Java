package cigma.pfe.models;

//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
/* pour @Inheritance JOINED ==> */
 @PrimaryKeyJoinColumn(name="normal_id")
/* pour @Inheritance SINGLE_TABLE ==>
@DiscriminatorValue("normal")*/
public class ClientNormal extends Client{
	private int importanceLevel;
	public ClientNormal(String name, int importanceLevel) {
		super(name);
		this.importanceLevel = importanceLevel;
	}

}
