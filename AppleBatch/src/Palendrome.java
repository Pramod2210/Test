import java.util.Scanner;

public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0 ,temp;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
    int num=sc.nextInt();
    temp=num;
    while(num>0) {  //212  21 2
    	int r=num%10; // 2  1  2
    	sum=(sum*10)+r; //2 212 

    	num=num/10;   //21  2  
    } 
    if(temp==sum) {
    System.out.println("its palindrome");
	}
    else {
    	System.out.println("its not palindrome");
    }
	}
}
