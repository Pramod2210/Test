package Array;


import java.sql.Date;
import java.util.Scanner;

public class Aritmeticmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AritmeticOperations a1=new AritmeticOperations();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
	    int a[]=new int[size];
	    System.out.println("enter the elements");
	    for(int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
	}
	    a1.addition(a);
         a1.pp(a);
         a1.display();
	    
		

}
}
