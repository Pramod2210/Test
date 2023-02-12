package Mapdemo;

public class Faculty {
	String name,dept,salary ;
	 int id;
	 Address a;
	public Faculty(String name, String dept, String salary, int id, Address a) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.id = id;
		this.a = a;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", dept=" + dept + ", salary=" + salary + ", id=" + id + ", a=" + a + "]";
	}
	 
	 
}
