package ComparaterComparable;

public class Employee implements Comparable<Employee> {
  int id;
  String name,dept,salary;
  char rating;
  
  Employee(int id,String name,String dept,String salary,char rating){
	   this.id=id;
	   this.name=name;
	   this.dept=dept;
	   this.salary=salary;
	   this.rating=rating;
  }

@Override
public String toString() {
	return "Employee id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", rating=" + rating
			+ "]";
}



  public int compareTo(Employee e) {
		
		/*  if(this.id>e.id) 
			  return 1;
		  else if(this.id<e.id)    this is for integer value
			  return -1; 
		  else 
			  return 0;*/

		 if(this.rating>e.rating) 
			  return 1;
		  else if(this.rating<e.rating)    //this is for char value
			  return -1; 
		  else 
			  
		return (this.name.compareToIgnoreCase(e.name)) ;  // for string
  }




  
}
