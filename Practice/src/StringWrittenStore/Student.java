package StringWrittenStore;

import java.util.Arrays;
import java.util.Scanner;



public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		  Scanner sc=new Scanner(System.in);
	      Student s1[]=new Student[2];
	      
	      for(int i=0;i<s1.length;i++) {
	    	  System.out.println("enter the Student id name marks");
	    	  int id=sc.nextInt();
	    	  String name=sc.next();
	    	  int []marks= new int[2];
	    	  for(int j=0;j<marks.length;j++) {
	    		 
	    	  marks[j]=sc.nextInt();
	    	  }
	    	   Student s2= new Student();
	    	   s2.setId(id);
	    	   s2.setName(name);
	    	   s2.setMarks(marks);
	    	   
	    	   s1[i]=s2;
	    	   
	      }
	       for (Student s5:s) {
	    	  System.out.println(Arrays.toString(s));
	       }
	      
	      
	
	}


	}

	}


