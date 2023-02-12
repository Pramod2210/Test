package Demo;

import java.util.Scanner;

public class Disarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  System.out.println("enter");
  int num= sc.nextInt();
  int copy=num;
  int copy2=num;
  int sum=0, count=0;
  
  while(num>0) {
	  count++;
	  num=num/10;
  }
  while(copy>0) {
    int r=copy%10;
     sum=sum+(int)Math.pow(r, count--);
     copy=copy/10;
	}
  
  if(copy2==sum) {
	  System.out.println("number is disarium");
  }
  else {
	  System.out.println("no");
  }
	}
}
