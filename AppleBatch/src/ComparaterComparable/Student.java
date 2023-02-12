package ComparaterComparable;

public class Student {
	 int id;
	  String name,dept,salary;
	  Student(int id,String name,String dept,String salary){
		   this.id=id;
		   this.name=name;
		   this.dept=dept;
		   this.salary=salary;
}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	  
}
