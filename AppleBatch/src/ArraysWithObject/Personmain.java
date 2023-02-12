package ArraysWithObject;

import java.util.Scanner;

public class Personmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C;
		
		Person p[] = new Person[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < p.length; i++) {
			System.out.println("enyter the person detail id name address idproof");
			int id = sc.nextInt();
			String name = sc.next();
			String address = sc.next();
			//String idname = sc.next();
			
			Idproof ip[]=new Idproof[2];
			for(int j=0;j<ip.length;j++) {
				System.out.println("enter idprooof detail idname validaty");
			  String ipname=sc.next();
			  int expire=sc.nextInt();
			   Idproof ipd=new Idproof();
			   ipd.setIdname(ipname);
			   ipd.setValidaty(expire);
			    ip[j]=ipd;
			}
			
           // String idname1=sc.next() ;
            Person p1 = new Person();
			p1.setId(id);
			p1.setName(name);
			p1.setAddress(address);
			p1.setI(ip);
			p[i]=p1;
			}
		
	  for(Person p2:p) {
		  for(Idproof i1:p2.i) {
			  if(i1.getIdname().equalsIgnoreCase("pancard")) {
				  
			 System.out.println(p2.getName()+p2.getAddress()+i1.getIdname());  
			  
		  }
		
		}
	}
	}
}
