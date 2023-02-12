package AbstractAssignment;

public class Employee {
   int id;
   String name;
   int salary;
   Date d;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Date getD() {
	return d;
}
public void setD(Date d) {
	this.d = d;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
}
   
	
   
    
	}


