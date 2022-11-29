import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, r;
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = Sc.nextInt();
		while (num > 0) {
			r = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}

}
