import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("the sum of odd number : " + sum);

	}

}
