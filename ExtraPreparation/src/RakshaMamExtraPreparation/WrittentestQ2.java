package RakshaMamExtraPreparation;

import java.util.Scanner;

//2 Write a program to print following series upto n. Accept n from user. 5, 13, 25, 41,61 , 85.
public class WrittentestQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n ");
    int num=sc.nextInt();
    int sum=0;
  
    for(int i=1;i<=num;i++) {
    	 int k=i;
    	 int l=i+1;
    	sum=(k*k)+(l*l);
    	System.out.print(sum+",");
    }
     
    	 
     }
    	 
}    
    		


