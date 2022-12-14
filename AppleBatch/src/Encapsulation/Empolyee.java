package Encapsulation;

import java.util.Scanner;

public class Empolyee {
	int id, salary;
	String name, Dept;

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
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1;i<=5;i++) {
    	Scanner sc=new Scanner (System.in);
    	System.out.println("enter the id,name,dept,salary");
    	int id=sc.nextInt();
    	String name=sc.next();
    	String dept=sc.next();
    	int salary=sc.nextInt();
    	Empolyee e=new Empolyee();
    	
    	e.setId(id);
    	e.setName(name);
    	e.setDept(dept);
    	e.setSalary(salary);
    	
    	System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
    	 System.out.println("------------***-----***---------");
    }
		
	}

}
