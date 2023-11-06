package bw.pharma.dispensaryDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DispensaryEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id; 
	@Id
	String dispName;
	String dispType, 
	dispLocation,
	dispEmail,
	dispPhone;
	
	public DispensaryEntity() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDispName() {
		return dispName;
	}

	public void setDispName(String dispName) {
		this.dispName = dispName;
	}

	public String getDispType() {
		return dispType;
	}

	public void setDispType(String dispType) {
		this.dispType = dispType;
	}

	public String getDispLocation() {
		return dispLocation;
	}

	public void setDispLocation(String dispLocation) {
		this.dispLocation = dispLocation;
	}

	public String getDispEmail() {
		return dispEmail;
	}

	public void setDispEmail(String dispEmail) {
		this.dispEmail = dispEmail;
	}

	public String getDispPhone() {
		return dispPhone;
	}

	public void setDispPhone(String dispPhone) {
		this.dispPhone = dispPhone;
	}

}
