package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class TableofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int num=sc.nextInt();
    int a[]=new int[10];
  int j=0;
      for(int i=1;i<=10;i++) {
    	  a[j]=num*i;  
    	  j++;
      }
    
      System.out.println(Arrays.toString(a));
      
	}

}
