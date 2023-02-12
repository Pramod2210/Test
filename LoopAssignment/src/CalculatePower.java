import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b, p, product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base");
		b = sc.nextInt();
		System.out.println("enter the power");
		p = sc.nextInt();
		while (p > 0) {
			product = product * b;
			p--;
		}
		System.out.println("the power of given number is : " + product);
	}

}
