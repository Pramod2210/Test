package ArraysWithObject;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Company c[]=new Company[2];
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<c.length;i++) {
    	 Department d []=new Department[2];
    	 System.out.println("enter cid and cname");
    	 int cid=sc.nextInt();
    	 String cname=sc.next();
    	 System.out.println("Enter the department informatiuom");
    	  for(int j=0;j<d.length;j++) {
    		  System.out.println("enter id,name,dept number");
    		  int id=sc.nextInt();
    		  String name=sc.next();
    		  String dept=sc.next();
    		  String number=sc.next();
    		  d[j]=new Department(id, name, dept, number);
    	  }
    	  c[i]=new Company(cid, cname, d);
     }
     for(Company c1:c){
    	 System.out.println(c1);
     }
	}

}
