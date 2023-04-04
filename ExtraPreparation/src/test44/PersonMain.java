package test44;

import java.util.Arrays;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      Person p[]=new Person[2];
      for(int i=0;i<p.length;i++) {
    	  System.out.println("enter id,pname,city,pin");
    	  int id=sc.nextInt();
    	  String pname=sc.next();
    	  String city= sc.next();
    	  int pin=sc.nextInt();
    	  Address a=new Address();
    	  a.setCity(city);
    	  a.setPin(pin);
    	  
    	  Person p1=new Person();
    	  p1.setId(id);
    	  p1.setPname(pname);
    	  p1.setA(a);
    	  p[i]=p1;
      }
      System.out.println(Arrays.toString(p));
      
	}

}
