package Mapdemo;

public class Employee {
 String name,dept,salary ;
 int id;

public Employee(String name, String dept, String salary, int id) {
	super();
	this.name = name;
	this.dept = dept;
	this.salary = salary;
	this.id=id;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "id "+id;
}
 
}
