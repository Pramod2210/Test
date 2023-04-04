package Test4;

public class Student {
  int id;
  String name;
  String dept;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
	return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
}
  
  
}
