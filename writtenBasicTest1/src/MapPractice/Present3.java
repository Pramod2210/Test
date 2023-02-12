package MapPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Present3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int num=sc.nextInt();
        
        while(num>0) {
           
        	int r=num%10;
        	num=num/10;
        	
        	if(r==3) {
        		System.out.println(true);
        		break;
        	}
        
           else {
        	   if(num==0)
        	   System.out.println(false);
           }
	}
        	
	}

}