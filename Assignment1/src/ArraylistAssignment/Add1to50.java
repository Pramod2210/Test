package ArraylistAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
public class Add1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer>a=new ArrayList<>();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter start to end range");
     int start=sc.nextInt();
     int end=sc.nextInt();
      for(int i=start;i<=end;i++) {
    	  a.add(i);
      }
      System.out.print(a+",");
      
      System.out.println("\n---even number---");
      System.out.println();
    for(Integer i1:a) {
    	if(i1%2==0) {
    		System.out.print(i1+",");
    	  }
      }
	}

}
