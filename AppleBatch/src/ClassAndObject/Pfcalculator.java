package ClassAndObject;

import java.util.Scanner;

public class Pfcalculator {
	
	double bonus(int salary,char ch) {
		
		System.out.println("original salary : "+salary);
		double bonus;
		if(ch=='A') 
		 bonus =salary+(salary*0.15f);
	   else if(ch=='B')
		 bonus =salary+(salary*0.10f);
	   else if(ch=='C')
		   bonus =salary+(salary*0.05f);
	   else
		   bonus=salary;
		System.out.println("the bonus is :"+bonus);
		return bonus;
	}
	void pf(float bonus) {
		float pf=bonus*0.15f;
		System.out.println("the pf is :"+pf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
    System.out.println("enter salary");
      int salary=sc.nextInt();
      System.out.println("enter the gread A/B/C/D");
      char ch=sc.next().charAt(0);
      Pfcalculator p= new Pfcalculator();
     float bonus= (float) p.bonus(salary, ch);
     p.pf(bonus);
     sc.close();
      
	}

}
