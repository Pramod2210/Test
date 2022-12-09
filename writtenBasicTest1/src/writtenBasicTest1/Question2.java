package writtenBasicTest1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days, month, year, week;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days");
		days = sc.nextInt();
		year = days / 365;
		month = days / 30;
		week = days / 7;

		System.out.println(" Days : " + days);
		System.out.println("Year : " + year);
		System.out.println("Months : " + month);
		System.out.println("week :" + week);

	}

}
