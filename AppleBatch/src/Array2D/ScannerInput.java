package Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
   System.out.println("enter row and coloum number");
   int r=sc.nextInt();
	int c=sc.nextInt();
	
    int a[][]=new int[r][c];
    System.out.println("enter the  elements");
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		a[i][j]=sc.nextInt();
    	}
    }
    
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		System.out.print(a[i][j]+"\t");
    	}
    	System.out.println();
    }
    
	}

}
