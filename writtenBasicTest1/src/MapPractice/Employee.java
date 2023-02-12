package MapPractice;

public class Employee implements Comparable<Employee>{
	  int id ,salary;
	   String name,dept;
	  Address a;
	  
	   
	   Employee(int id,String name,String dept,int salary,Address a){
		   this.id=id;
		   this.name=name;
		   this.dept=dept;
		   this.salary=salary;
		   this.a=a;
	   }
	   public String toString() {
		   return +id+" "+name+" "+dept+" "+salary+" "+a+"\n";
	   }
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.name.equals(o.name)) {
			if(this.id>o.id	)
				return 1;
			else if(this.id<o.id)
				return -1;
			
		else
			return 0;
			
		}
		else {
		return this.name.compareTo(o.name);
	}
	}
}



