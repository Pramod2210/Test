package COLLECTION;

import java.util.ArrayList;
import java.util.Scanner;

public class Personmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Person>a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student no");
        int size=sc.nextInt();
        for(int i=0;i<size;i++) {
        	System.out.println("enter person id name contact");
        	int id=sc.nextInt();
        	String name=sc.next();
        	String contact=sc.next();
        	System.out.println("enter city state country");
        	 
        }
        
	}

}
