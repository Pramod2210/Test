package AssignmentInheritance;

public class Person {
String name,contact,address,idProof;
int id;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getIdProof() {
	return idProof;
}
public void setIdProof(String idProof) {
	this.idProof = idProof;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
/*@Override
public String toString() {
	return "Person name=" + name + "\ncontact=" + contact + "\naddress=" + address + "\nidProof=" + idProof + "\nid="
			+ id + "]";
}*/


void display() {
	
	System.out.println("Person name=" + name + "\ncontact=" + contact + "\naddress=" + address + "\nidProof=" + idProof + "\nid="
			+ id );

	
}
}
