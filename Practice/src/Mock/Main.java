package Mock;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
			  Scanner sc=new Scanner(System.in);
		      Student s[]=new Student[2];
		      
		      for(int i=0;i<s.length;i++) {
		    	  System.out.println("enter the Student id name marks");
		    	  int id=sc.nextInt();
		    	  String name=sc.next();
		    	 int  []marks= new int[2];
		    	  for(int j=0;j<marks.length;j++) {
		    		 
		    	  marks[j]=sc.nextInt();
		    	  }
		    	   Student s1= new Student();
		    	   s1.setId(id);
		    	   s1.setName(name);
		    	   s1.setMarks(marks);
		    	   s[i]=s1;
		    	   
		      }
		      
		      for(int i=0;i<s.length;i++) {
		    
		    	  System.out.println(s[i].getName()+" "+s[i].getMarks()[1]);
		    	 // System.out.println(Arrays.toString(s[1].getMarks()));
		       }
		      
		      
			}
	}


