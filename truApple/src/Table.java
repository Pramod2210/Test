import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prod;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			prod = n * i;
			System.out.println(n + "*" + i + "=" + prod);
		}
	}

}
