package Array;
import java.util.Arrays;
import java.util.Scanner;
public class scannerdemo {

	
		Scanner sc=new Scanner(System.in);
		{
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]= new int[size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element");
			a[i]=sc.nextInt();
		}
		void even(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
				
			}
		}
		}
}
}
		System.out.println(Arrays.toString(a));
}	
}
