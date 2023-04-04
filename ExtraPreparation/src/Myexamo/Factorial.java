package Myexamo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
      int num=sc.nextInt();
      int product=1;
      for(int i=num;i>0;i--) {
    	  product=product*i;
      }
      System.out.println(product);
     
	}

}
