import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num,i=2;
		double  mid;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the number");
	    num=sc.nextInt();
		mid = num / 2;    
		while (i <= mid) {
			if (num % i == 0) {
				break;
			}
			i++;
		}
		if (i >= mid) {
			System.out.println("it prime");
		} else {
			System.out.println("its not prime");
		}
	}

}
