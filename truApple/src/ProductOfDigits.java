import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		while (n > 0) {
			r = n % 10;
			product = product * r;
			n = n / 10;
		}
		System.out.println("the Product Of Digits is: " + product);
	}

}
