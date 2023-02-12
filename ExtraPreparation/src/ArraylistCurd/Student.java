package ArraylistCurd;

public class Student {
	  
		     int id;
		     String name,dept;
		     int marks;
			public Student(int id, String name, String dept, int marks) {
				
				this.id = id;
				this.name = name;
				this.dept = dept;
				this.marks = marks;
			}
			
			public String toString() {
				return "\nStudent [id=" + id + ", name=" + name + ", dept=" + dept + ", marks=" + marks + "]";
			}
			
		 }

