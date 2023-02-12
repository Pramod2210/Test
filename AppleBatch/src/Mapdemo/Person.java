package Mapdemo;

public class Person {
	 int id;
	   String name,dept,mark;
	public Person(int id, String name, String dept, String mark) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.mark = mark;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", dept=" + dept + ", mark=" + mark + "\n";
	}
	 public int hashCode() {
		 return id;
	 }
	 public boolean equals(Object o) {
		 
		 Person p=(Person)o;
		 if(this.id==p.id) {
			 p.name=this.name;
			 p.dept=this.dept;
			 return true;
		 }
		 
		return false;
		 
	 }
}
