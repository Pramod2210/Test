package Array2D;

import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row column");
		int r = sc.nextInt();
		int c = sc.nextInt();

		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int d[][] = new int[r][c];
		System.out.println("enter first matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter second matrix");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Substraction  of two matrix");

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				d[i][j] = a[i][j] - b[i][j];
			}
		}
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();

		}

	}

}
