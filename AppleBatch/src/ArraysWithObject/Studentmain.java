package ArraysWithObject;

import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s[]=new Student[2];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<s.length;i++) {
        	System.out.println("enter id,name,dept,marks");
        int id=sc.nextInt();
        String name=sc.next();
        String dept=sc.next();
         int marks=sc.nextInt();
         s [i]=new Student(id,name,dept,marks);
           
         
        }
        
        for(Student s1:s) {
        	//if(s1.dept.equalsIgnoreCase("comp"))
        	System.out.println(s1);
        }
        }
	}


