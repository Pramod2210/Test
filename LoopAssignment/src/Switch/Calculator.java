package Switch;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c;
		char ch;
		do {
			System.out.println("enter which operation you would like to perform");
			System.out.println("1:Addition\n2:Substraction\n3:Multiplication\n4:Division");
			int num = sc.nextInt();
			System.out.println("enter two number");
			int a = sc.nextInt();
			int b = sc.nextInt();
			switch (num) {
			case 1: {
				c = a + b;
				System.out.println("the addition is :" + c);
			}
				break;
			case 2: {
				c = a - b;
				System.out.println("the Substraction is :" + c);
			}
				break;
			case 3: {
				c = a * b;
				System.out.println("the Multipliction is :" + c);
			} break;
			case 4: {
				c = a / b;
				System.out.println("the division is :" + c);
			}
			}

			System.out.println("can you reviese the process Y/N");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}
}
