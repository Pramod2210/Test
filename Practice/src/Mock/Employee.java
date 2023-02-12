package Mock;

public class Employee {
 private int id,salary;
 private String name,dept;
 
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee id=" + id + "\nsalary= " + salary + "\nname= " + name + "\ndept=" + dept ;
}
 
 
}
