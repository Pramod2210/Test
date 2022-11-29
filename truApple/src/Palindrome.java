import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter range ");
		int range1=sc.nextInt();
		System.out.println("enter range ");
		int range2=sc.nextInt();
		int num1=0;
		int num2=0;
		for (int i =range1; i <=range2;i++) {
			System.out.println("hhhh");
			  num1=i;
			  num2= 0;
			while (num1 != 0) {
				System.out.println("kkkk");
				int r = num1 % 10;
				i = num1 / 10;
				 num2 = num2 * 10 + r;
			}
			if (i == num2) 
				System.out.println(i);
			}
		sc.close();
		}
	}

