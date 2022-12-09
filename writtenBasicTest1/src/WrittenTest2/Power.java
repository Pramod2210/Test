package WrittenTest2;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated me
		int product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base");
		int b = sc.nextInt();
		System.out.println("Enter Power");
		int p = sc.nextInt();

		while (p > 0) {
			product = product * b;
			p--;
		}
		System.out.println(product);
	}

}
