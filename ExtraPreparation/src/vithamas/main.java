package vithamas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fixedNum=25;
		
		System.out.println("Enter number to guess");
		int num=sc.nextInt();
		while (num!=fixedNum)
		if(num<fixedNum){
			System.out.println("number is less than fixednum, enter greater number");
			 num=sc.nextInt();
		}
		else if (num>fixedNum){
			System.out.println("number is greater than fixed number ,enter lesser num");
			num=sc.nextInt();
		}
		System.out.println("guessed right number,number is "+fixedNum);

	}

}
