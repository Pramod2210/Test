package ArraysWithObject;

import java.util.Scanner;

public class Theatermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m[]=new Movie[2];
		  Theater t[]=new Theater[2];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<t.length;i++) {
        //Theater t[]=new Theater[2];	
        System.out.println("enter theater  detail id name");
        int tid=sc.nextInt();
		 String tname=sc.next();
		 //int Releasyear=sc.nextInt();
		 System.out.println("enter the movie detail ");
		 for(int j=0;j<m.length;j++) {
			 int id=sc.nextInt();
			 String name=sc.next();
			 int Releasyear=sc.nextInt();
			//t[j] =new Theater(tid, tname);	
			m[j]=new Movie(id, name, Releasyear, t);
			
		 }
		 t[i] =new Theater(tid, tname);
		// m[i]=new Movie(id, name, Releasyear, t);
        
    }
    for( Movie m1:m) {
    	if(m1.Releasyear==2020) {
    	System.out.println(m1);	
    	}
    	
    }
	} 
   
    
	}


