package test44;

import java.util.Scanner;

public class Averageofgiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("emter num");
		int num=sc.nextInt();
		int sum=0;
	int count=0;
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			num=num/10;
			count++;
		}
		float avg=(sum/count);
		
		System.out.println(avg);
		
		
		
	}

}
