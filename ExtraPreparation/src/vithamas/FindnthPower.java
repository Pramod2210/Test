package vithamas;
import java.util.Scanner;
public class FindnthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  int num=sc.nextInt();
  
    int count=0,product=1;
    int temp=num;
    while(num>0) {
    	num=num/10;
    	count++;
    }
    for(int i=0;i<count;i++) {
    	product =product*temp;
    }
    System.out.println(product);
	}

}
