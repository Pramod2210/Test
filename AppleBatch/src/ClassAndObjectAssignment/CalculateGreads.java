package ClassAndObjectAssignment;

import java.util.Scanner;

public class CalculateGreads {
	int m1,m2,m3;
	double percentage;
	 
	void setmarks() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the marks m1,m2,m3");
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
		}
	void percent() {
		int total=m1+m2+m3;
		percentage =(total/3);
		System.out.println("the percentage is : "+percentage);
	}
	void gread() {
		if(percentage>=75.00) 
			System.out.println("first class");
		else if(percentage>=60.00)
			System.out.println("second class");
		else if(percentage>=35.00)
			System.out.println("third class");
		else
			System.out.println("fail \n better luck next time");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateGreads c=new CalculateGreads();
		c.setmarks();
	    c.percent();
	    c.gread();
	}

}
