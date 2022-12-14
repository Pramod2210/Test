package ConstructorAssignment;
/*1.	Create one class Employee (emp_id, name, sal) with private access specifier and create getter and setter. Create 2 object s
One  by default  constructor and then set data using setters
Create second object by parameterized constructor.
Call display on both objects*/

public class Empolyee {
	int id, salary;
	String name;

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	private int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	private String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Empolyee() {

	}

	Empolyee(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;

	}

	public static void main(String[] args) {

		Empolyee e = new Empolyee();
		System.out.println("id : " + e.getId() + " name : " + e.getName() + " sal : " + e.getSalary());
		Empolyee e1 = new Empolyee();
		e1.setId(50);
		e1.setName("pramod");
		e1.setSalary(75000);
		System.out.println("id : " + e1.getId() + " name : " + e1.getName() + " sal : " + e1.getSalary());
	}

}
