package contaniment;

public class Empolyee {
  private int id,salary;
  private String name;
  Mydate m;
  EDepartment ed;
  
/*public Mydate getM() {
	return m;
}
public void setM(Mydate m) {
	this.m = m;
}
public EDepartment getEd() {
	return ed;
}
public void setEd(EDepartment ed) {
	this.ed = ed;
}
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
}*/

  Empolyee(int id,int salary,String name,Mydate m,EDepartment ed){
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	  this.ed=ed;
	  this.m=m;
			  
  }
  
public String toString() {
	return "Empolyee [id=" + id + ", salary=" + salary + ", name=" + name + ", m=" + m + ", ed=" + ed + "]";
}
  
  
  
}
