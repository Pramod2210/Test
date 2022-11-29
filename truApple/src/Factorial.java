import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			product = product * i;
		}
		System.out.println("the factorial : " + product);
	}

}
