import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		temp = num;
		while (num != 0) { // 18
			r = num % 10; // 8 1
			sum = sum + r; // 8 9
			num = num / 10; // 1 0
		}
		if (temp % sum == 0) {
			System.out.println("given number is Harshad Number");
		} else {
			System.out.println("Given number is not harshad number");
		}
	}

}
