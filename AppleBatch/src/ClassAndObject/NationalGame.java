package ClassAndObject;

import java.util.Scanner;

public class NationalGame {
	void game(String c) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter the country name"); String c = sc.nextLine();
		 */

		switch (c) {
		case "India":
			System.out.println(" The National game is Hockey");
			break;
		case "China":
			System.out.println("The National game is Table Tennis");
			break;
		case "Bangladesh":
			System.out.println("The National game is Kabaddi");
			break;
		case "Italy":
			System.out.println("The National game is football");
			break;
		case "United States":
			System.out.println("The National game is baseball");
			break;
		default:
			System.out.println("Country ame is Invalid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the country name");
		String a = sc.nextLine();
		NationalGame n = new NationalGame();
		n.game(a);
	}

}