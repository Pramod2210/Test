package Exception;

import java.util.Scanner;

public class AgeExceptionDemo {
	
	
	void ageCheck(int age)throws AgeException{
		if(age<18) {
			throw new AgeException("age is less....Sorry not allowed");
		}
		else if (age >60){
			throw new AgeException("age is more....Sorry not allowed");
		}
		else {
			System.out.println("enjoy ur ride");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeExceptionDemo a=new AgeExceptionDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		try {
			a.ageCheck(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
