package Inhertance;

public class Employee extends Person {
	String dept;
	int Salary;
 public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", Salary=" + Salary + "]";
	}
  void pf() {
	  System.out.println("pf is: "+Salary*0.10);
  }
 
}
