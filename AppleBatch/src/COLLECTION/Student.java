package COLLECTION;

public class Student {
  private int id;
  private String name,dept,contact;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "Student id=" + id + ", name=" + name + ", dept=" + dept + ", contact=" + contact ;
}
  
}
