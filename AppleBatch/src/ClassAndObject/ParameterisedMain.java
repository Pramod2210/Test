package ClassAndObject;

import java.util.Scanner;

public class ParameterisedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("enter number");
         int x,y;
         x=sc.nextInt();
         y=sc.nextInt();
         ParametrisedMethod p=new  ParametrisedMethod();
         p.add(x, y);
         p.div(x, x);
         p.sub(x, y);
         p.multi(x, y);
	}

}
