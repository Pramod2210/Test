package Mapdemo;

public class pramod {
   int id;
   String name,dept,mark;
public pramod(int id, String name, String dept, String mark) {
	
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
   public boolean  equals(Object o) {
	   pramod p=(pramod)o;
	   if(this.id==p.id) {
		  // p.name=this.name;
		   p.dept=this.dept;
		  // p.mark=this.mark;
		  // this.name=p.name;
		// this.dept=p.dept;
		 //  this.mark=p.mark;
		   return true;
	   }
	   else {
		   return false;
	   }
   }
}
