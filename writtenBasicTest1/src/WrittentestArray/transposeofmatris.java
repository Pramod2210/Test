package WrittentestArray;

import java.util.Scanner;

public class transposeofmatris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
       Scanner sc=new Scanner(System.in)  ;
       System.out.println("enter the matrix element");
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
        	 b[i][j]=a[j][i];
        }
        }
        System.out.println("***-----****");
        	 for(int i=0;i<b.length;i++) {
             	for(int j=0;j<b.length;j++) {
             		System.out.print(b[i][j]+" ");
             	}
             	System.out.println();
             }
        	  if(a==b) {
        		  System.out.println("is symatric");
        	  }
        	  else {
        		  System.out.println("not");
        	  }

   
	}
        
	

}

