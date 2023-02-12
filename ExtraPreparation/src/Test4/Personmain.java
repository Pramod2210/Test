package Test4;

import java.util.Scanner;
/*10. Class Person is as follows . Person { String name , int salary , String address } 
Create a 
person object by using getter setter methods. Create clone of person object. [1m]*/

public class Personmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
    
    		 System.out.println("enter the name salary address");
    		 String name=sc.next();
    		 int salary=sc.nextInt();
    		 String address=sc.next();
    		 
    		 Person p=new Person();
    		 p.setName(name);
    		 p.setSalary(salary);
    		 p.setAddress(address);
    		 
    		 Person p2=p;
    		 System.out.println(p2);
    		 System.out.println(p);
    		 
    		 
    	 }
     
	}


