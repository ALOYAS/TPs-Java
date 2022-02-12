package cigma.pfe.models;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Column;

@Entity
@Data
@IdClass(CompanyId.class)
public class Company {
	@Id
	private long rc;
	@Id
	private long idTribunal;
	private String name;
	private String address;
	private String phone;
//	private String contactFirstName;
//	private String contactLastName;
//	private String contactPhone;
	@Embedded
	@AttributeOverride(name = "phone", column = @Column(name = "PHONE_PERSON"))
	private ContactPerson contactPerson;
}