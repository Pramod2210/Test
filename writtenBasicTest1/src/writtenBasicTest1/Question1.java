package writtenBasicTest1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length");
		int l = scan.nextInt();
		System.out.println("enter le bredth");
		int b = scan.nextInt();
		int perimeter = 2 * l * b;
		System.out.println("the perimeter of rectangle is : " + perimeter);

	}

}
