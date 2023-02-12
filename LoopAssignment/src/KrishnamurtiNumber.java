import java.util.Scanner;

public class KrishnamurtiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		temp = num;
		int sum = 0;
		while (num != 0) {
			int product = 1;
			r = num % 10; // 5 4
			for (int i = 1; i <= r; i++) {
				product = product * i;

			}
			num = num / 10;
			sum = sum + product; // 12 // 14
		}
		System.out.println("hi");
		if (temp == sum) {
			System.out.println("it is krishnmurti number");
		} else {
			System.out.println("its not kriushnamurti number");
		}

	}

}
