package AssignmentInheritance;

public class IdProof extends Person {
	String idname,number,validity;

	

	/*@Override
	public String toString() {
		super.toString();
		return "\nIdProof name=" + name + "\nnumber=" + number + "\nvalidity=" + validity ;
	}*/
	
	public String getIdname() {
		return idname;
	}



	public void setIdname(String idname) {
		this.idname = idname;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getValidity() {
		return validity;
	}



	public void setValidity(String validity) {
		this.validity = validity;
	}



	void display() {
		if(address=="pune"&& idname=="adhar") {
		super.display();
		System.out.println( "\nIdProof name=" + idname + "\nnumber=" + number + "\nvalidity=" + validity );
	}
		else {
			System.out.println("not valid");
		}
	
	}
}
