package Switch;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int r = num % 2;

		switch (r) {
		case 0:
			System.out.println("number is even");
			break;
		default:
			System.out.println("number is odd");
		}

	}

}
