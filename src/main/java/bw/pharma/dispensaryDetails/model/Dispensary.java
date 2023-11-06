package bw.pharma.dispensaryDetails.model;

public class Dispensary {
	int id; 
	String dispName, 
	dispType, 
	dispLocation,
	dispEmail,
	dispPhone;


	public Dispensary() {
		
	}


	public Dispensary(String dispName, String dispType, String dispLocation, String dispEmail, String dispPhone) {
		super();
		this.dispName = dispName;
		this.dispType = dispType;
		this.dispLocation = dispLocation;
		this.dispEmail = dispEmail;
		this.dispPhone = dispPhone;
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
