package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e[]= new Employee[2];
   Scanner sc=new Scanner(System.in);
      for(int i=0;i<e.length;i++) {
    	  System.out.println("enter employee id name,salary");
    	  int id=sc.nextInt();
    	  String name=sc.next();
    	  int salary=sc.nextInt();
    	   System.out.println("department id name");
    	   int did=sc.nextInt();
    	   String dname=sc.next();
    	   System.out.println("enter dayte month year");
    	   int date=sc.nextInt();
    	   int month=sc.nextInt();
    	   int year=sc.nextInt();
    	   Department d1=new Department();
    	   d1.setDid(did);
    	   d1.setDname(dname);
    	   
    	   Mydate m1=new Mydate();
    	   m1.setDay(date);
    	   m1.setMonth(month);
    	   m1.setYear(year);
 
    	   Employee e1=new Employee();
    	   e1.setId(id);
    	   e1.setName(name);
    	   e1.setSalary(salary);
    	   e1.setD(d1);
    	   e1.setM(m1);
    	   
    	   e[i]=e1;
     }
     for(Employee e2:e) {
    	 System.out.println(e2.d.getDname());
    	
    	 System.out.println(e2.getName()+" "+e2.getSalary());
     }
      
	}

}
