package Contaminent;

public class Student {
 int roll;
 String name;
 Department d;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
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
public String toString() {
	return "name "+name+"roll  :"+roll+"Department "+d;
	
	

}

 
 
 
 
 
 /*public void setDepartment(Department d) {
	 this.d=d;
 }
 public Department get() {
	return d;
	 
 }*/
}
