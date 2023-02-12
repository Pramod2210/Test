import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   char ch;
		Scanner Sc = new Scanner(System.in);
		do {
		System.out.println("enter the n mumber");
		int n = Sc.nextInt();
		  int sum=0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {         //
				sum = sum + i;
			}
		}
		System.out.println("The sum of all even number is : "+sum);
		
		System.out.println("can you check another range then plz y/n");
		 ch=Sc.next().charAt(0);
		}
    while(ch =='y' || ch=='Y');
    	
    }
		}	
	
	

