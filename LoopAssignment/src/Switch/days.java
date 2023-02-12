package Switch;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month");
		String month = sc.nextLine();
		switch (month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "octobar":
		case "december":
			System.out.println("the days in the month : 31");
			break;
		case "february":
			System.out.println("the days in the month is :29");
			break;
		case "april":
		case "june":
		case "september":
		case "november":
			System.out.println("the days in the month : 30");
		}
	}

}
