package ArrayAssignment;

public class Employee {
 int id ,salary;
 String name;
 Department d;
 Mydate m;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department getD() {
	return d;
}
public void setD(Department d) {
	this.d = d;
}
public Mydate getM() {
	return m;
}
public void setM(Mydate m) {
	this.m = m;
}
@Override
public String toString() {
	return "Employee id=" + id + ", salary=" + salary + ", name=" + name + ", d=" + d + ", m=" + m;
}
 
 
}
