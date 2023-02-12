package RakshaMamExtraPreparation;

import java.util.Scanner;

//3.	Write a program to print following series. 0,1,3,6,10,15,21,28. Accept number of terms 
   //to print from user.
public class WrittentestQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
   System.out.println("enter the  n number");
	   int num=sc.nextInt() ;
	   int sum=0;
	   System.out.print("0"+" ");
	   for(int i=1;i<=num;i++) {
		  sum= sum+i; 
		  System.out.print(sum+" ");
	   }
   
	}

}
