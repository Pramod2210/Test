package ClassAndObject;

import java.util.Scanner;

public class Calculator {
    void add() {
	   Scanner scan =new Scanner(System.in);
	   System.out.println("enter two number");
	   int a=scan.nextInt();
	   int b=scan.nextInt();
	   System.out.println("addition is :"+(a+b));
	
   }
   void sub() {
	   Scanner scan =new Scanner(System.in);
	   System.out.println("enter two number");
	   int a=scan.nextInt();
	   int b=scan.nextInt();
	   System.out.println("substraction is :"+(a-b));
   }
    void multi() {
    	Scanner scan =new Scanner(System.in);
 	   System.out.println("enter two number");
 	   int a=scan.nextInt();
 	   int b=scan.nextInt();
 	   System.out.println("multiplication is :"+(a*b));
    }
    void div() {
    	Scanner scan =new Scanner(System.in);
 	   System.out.println("enter two number");
 	   int a=scan.nextInt();
 	   int b=scan.nextInt();
 	   System.out.println("division is :"+(a/b));
    }
}
