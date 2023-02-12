package MapPractice;

public class Student {
   int id ,salary;
   String name,dept;
  
   
   Student(int id,String name,String dept,int salary){
	   this.id=id;
	   this.name=name;
	   this.dept=dept;
	   this.salary=salary;
   }
   public String toString() {
	   return +id+" "+name+" "+dept+" "+salary+"\n";
   }
}
