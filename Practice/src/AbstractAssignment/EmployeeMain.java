package AbstractAssignment;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e[]=new Employee[3];
    Scanner sc=new Scanner(System.in);
    int i=0;
    for( i=0;i<e.length;i++) {
    	System.out.println("enter employee detail id name salary");
    	int id=sc.nextInt();
    	String name=sc.next();
    	int salary=sc.nextInt();
    	System.out.println("enter the date month year");
    	int date=sc.nextInt();
    	int month=sc.nextInt();
    	int year=sc.nextInt();
    	
    	Date d=new Date();
    	d.setDate(date);
    	d.setMonth(month);
    	d.setYear(year);
    	
    	Employee e1=new Employee();
    	e1.setId(id);
    	e1.setName(name);
    	e1.setSalary(salary);
    	e1.setD(d);
    	
    	e[i]=e1;
    
    }
    
  // for(Employee e2:e) {
	   for(i=0;i<e.length;i++) {
	   for(int j=0;j<e.length;j++) {
		   if(e[i].getD()==e[j].getD()) {
			   System.out.println(e[i]);
	  
	  
   } 
	}
	}
}
}
