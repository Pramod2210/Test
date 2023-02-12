package COLLECTION;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ;
       ArrayList<Student>a=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       do {
    	   System.out.println("enter the id name dept contact");
    	   int id=sc.nextInt();
    	   String name=sc.next();
    	   String dept=sc.next();
    	   String contact=sc.next();
    	   
    	   Student s=new Student();
    	   s.setId(id);
    	   s.setName(name);
    	   s.setDept(dept);
    	   s.setContact(contact);
    	   
    	   a.add(s);
    	  
    	   System.out.println("do you add one more student y/n");
    	   ch=sc.next().charAt(0);
       }
       while(ch=='y'||ch=='Y');
       
       System.out.println(a);
	}

}
