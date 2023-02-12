package Demo;

import java.util.Scanner;

public class Krishna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ");
        int num=sc.nextInt();
        int temp;
       temp=num;
       int sum=0;
       while(num>0) {
    	   int r=num%10;
    	    int product=1;
    	   for(int i=r;i>0;i--) {
    		   product=product*i;
    	   }
    	   num=num/10;
    	   sum=sum+product;
       }
       if(temp==sum) {
    	   System.out.println("number is  krushna");
       }
       else {
    	   System.out.println("no krushna");
       }
        
	}

}
