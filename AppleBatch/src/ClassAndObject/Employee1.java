package ClassAndObject;

import java.util.Scanner;

public class Employee1 { 
	int id,salary,rating;
	String contact;
	float pf;
	String name,dept;
	
	void input() {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the id,name,dept,salary,contact,rating");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		salary=sc.nextInt();
		contact=sc.next();
		rating=sc.nextInt();
	}
	void bonus() {
		System.out.println("name : "+name+"\n salary :"+salary);
		if(rating==1)
			System.out.println("bonus is :"+salary*0.10f);
		 else if (rating==2)	
		System.out.println("bonus is :"+salary*0.13f);
		 else
			 System.out.println("bonus is :"+salary*0.15f);
	}
	void pfcalculation() {
		pf=salary*0.10f;
		System.out.println("pf is :"+pf);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee1 e=new Employee1();
     e.input();
     e.bonus();
     e.pfcalculation();
	}

}
