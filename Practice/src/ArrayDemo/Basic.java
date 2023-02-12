package ArrayDemo;

import java.util.Arrays;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 50, 10, 3, -4, 108, 198, -7 }; // 198

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) // forward
		{
			System.out.print(a[i] + " ");
		}

		for (int i = a.length - 1; i >= 0; i--)// reverse or backward
		{
			System.out.print(a[i] + " ");
		}

		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);
		System.out.println(a[a.length - 3]);

	}

}
