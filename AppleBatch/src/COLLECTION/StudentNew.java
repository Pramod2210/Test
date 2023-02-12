package COLLECTION;

import java.util.ArrayList;

public class StudentNew {
   int id;
   String name,dept;
   double percent;
   ArrayList<Integer>marks;
   
public double getPercent() {
	return percent;
}
public void setPercent(double percent) {
	this.percent = percent;
}
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
public ArrayList<Integer> getMarks() {
	return marks;
}
public void setMarks(ArrayList<Integer> marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "StudentNew [id=" + id + ", name=" + name + ", dept=" + dept + ", percent=" + percent + ", marks=" + marks
			+ "]";
}
	
	}


