package Array;

import java.util.Scanner;

public class Even {
	void display1() {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size");
 int size=sc.nextInt();
 
 int a[]=new int[size];
 System.out.println("enter the element");
 for(int i=0;i<a.length;i++) {
	 a[i]=sc.nextInt();
	}
  System.out.println("the  elements are");
	  for(int i=0;i<a.length;i++) {
		  System.out.print(a[i]+" ");
	  }
	  System.out.println("\nin given array the even elements are");
	  System.out.println();
	  for(int i=0;i<a.length;i++) {
		  if(a[i]%2==0) {
			  System.out.print(a[i]+" ");
		  }
	  }
	
  }
}
  
