package ClassAndObject;

import java.util.Scanner;

public class SumOfFactor {
	
	 void sum(int a) {
		 int i=2,sum=1;
		 while(i<=a) {
			 if(a%i==0) {
				 sum=sum+i;
			 }
			 i++;
		 }
		 System.out.println(sum);
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value ");
       int a=sc.nextInt();
       SumOfFactor s=new SumOfFactor();
       s.sum(a);
	}

}
