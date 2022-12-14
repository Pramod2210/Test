package PolyAssignment;

public class Department {
  String dname;
  int id;
  Student s;
  
  Department(int id,String dname,int rollno,String name){
		 this.id=id;
		 this.dname= dname;
		s= new Student(rollno, name);
	 }

@Override
public String toString() {
	return "Department [name=" + dname + ", id=" + id + ", s=" + s + "]";
}

  
}
