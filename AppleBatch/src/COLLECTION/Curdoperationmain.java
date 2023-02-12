package COLLECTION;

import java.util.ArrayList;
import java.util.Scanner;

public class Curdoperationmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ArrayList<Integer>a=new ArrayList<>();
	     Curdoperation c=new Curdoperation();
	     char ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("welcome to perform curd operations");
			System.out.println("press 1 for add the element\npress 2 for update the element\npress3for delete the element\npress 4 search the element");
			int i=sc.nextInt();
			switch(i) {
			case 1: {
				c.add(a);
				break;
			}
			case 2 :{
				 c.update(a);
				 break;
			}
			case 3:{
				c.delete(a);
				break;
			}
			case 4:{
				 c.search(a);
				 break;
			}
			default :{
				System.out.println("press correct key");
			}
			}
			
		System.out.println("do you want to continue then press Y/N");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
