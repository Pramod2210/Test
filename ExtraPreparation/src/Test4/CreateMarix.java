package Test4;
	import java.util.Arrays;
	import java.util.Scanner;
	public class CreateMarix {
	/*9. Write a program to create a array with dimensions nXm . Accept n and m from user. Accept
	array values from user . Also display them. [1m]*/

	

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of n");
			int n = sc.nextInt();
			System.out.println("Enter value of m");
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			System.out.println("Enter Array Elemnts");
			for(int i = 0;i< n;i++)
			{
			  for(int j = 0;j< m;j++)
			  {
				a[i][j] = sc.nextInt();
			  }
		    }
			for(int i = 0;i< n;i++)
			{
			  for(int j = 0;j< m;j++)
			  {
				  System.out.print(a[i][j]+" ");
			  }
			  System.out.println();
			}
		}
	}

