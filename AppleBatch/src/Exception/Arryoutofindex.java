package Exception;

import java.util.Scanner;

public class Arryoutofindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {10,20,3,5,4,7,8};
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the endix");
     int i=sc.nextInt();
     System.out.println(a[i]);
	}

}
