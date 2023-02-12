package Switch;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the alphabet");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("the alphabet is vowel");
			break;
		default:
			System.out.println("the aplhabet is consonant");
		}

	}

}
