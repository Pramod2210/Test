package ArraysWithObject;

public class Department {
 int id;
 String name,dept,number;
 Department(int id,String name,String dept,String number){
	 this.id=id;
	 this.name=name;
	 this.dept=dept;
	 this.number=number;
 }
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", dept=" + dept + ", number=" + number + "]";
}
 
 
}
