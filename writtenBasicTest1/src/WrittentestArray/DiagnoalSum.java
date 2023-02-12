package WrittentestArray;

import java.util.Scanner;

public class DiagnoalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][3];
		int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter matrix element");
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a.length;j++) {
    	  a[i][j]=sc.nextInt();
      }
      }
    	  for(int i=0;i<a.length;i++) {
        	  for(int j=0;j<a.length;j++) {  
        		 
        		  System.out.print(a[i][j]+" ");
        		  
        	  }
        	  System.out.println();
	}
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a.length;j++) {
    		if(i==j)  {
    			sum=sum+a[i][j];
    		}
    	  }
	}
      System.out.println(sum);
}
}
