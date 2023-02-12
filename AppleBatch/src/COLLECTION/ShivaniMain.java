package COLLECTION;

import java.util.ArrayList;
import java.util.Scanner;

public class ShivaniMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList <Student>  ns= new ArrayList<>();
			
		     Scanner sc =new Scanner(System.in);
				
		     System.out.println("enter the student no ");    // added by pramod
		     int size=sc.nextInt();                      //added by pramod
				for(int i=0;i<size;i++)  // i<size updated
				{
					System.out.println("Enter the id,name,dept,contact for student: ");
					int id=sc.nextInt();
					String name=sc.next();
					String dept= sc.next();
					String contact= sc.next();
					
					Student s=new Student();
					s.setId(id);
					s.setName(name);
					s.setDept(dept);
					
					s.setContact(contact);
					
					ns.add(s);    // added by pramod
					
				}
				System.out.println(ns);   // added by pramod
			
	}

}
