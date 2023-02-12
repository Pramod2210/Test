package ArrayAssignment;

import java.util.Scanner;

public class Personmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person p[]=new Person[2];
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<p.length;i++) {
        	 System.out.println("enter the person detail id name address");
        	 int id=sc.nextInt();
        	 String name=sc.next();
        	 String address=sc.next();
        	 Idproof ip[]=new Idproof[2];
        	 for(int j=0;j<ip.length;j++) {
        		 System.out.println("enter name and validaty");
        		 String iname=sc.next();
        		 int validaty =sc.nextInt();
        		 
        		 Idproof ip1=new Idproof();
        		 ip1.setIname(iname);
        		 ip1.setValidity(validaty);
        		 
        		 ip[j]=ip1;
        	 }
        	 Person p1=new Person();
        	 p1.setId(id);
        	 p1.setName(name);
        	 p1.setAddress(address);
        	 p1.setIp(ip);
           p[i]=p1;
         }
         
         for(Person p2:p) {
        	 System.out.println(p2);
        	 System.out.println("****---*****");
        	 for(Idproof i1:p2.ip) {
        		 if(i1.getIname().equalsIgnoreCase("passport")) {
        			 System.out.println(p2);
        		 }
        		 
        	 }
         }
	}

}
