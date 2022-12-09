package WrittenTest2;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, product = 1, r;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = Sc.nextInt();
		while (num != 0) {
			r = num % 10;
			product = product * r;
			num = num / 10;

		}
		System.out.println("the Product of Given Number: "+product);
	}

}
