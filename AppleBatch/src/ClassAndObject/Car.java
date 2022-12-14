package ClassAndObject;

import java.util.Scanner;

public class Car {
	  Scanner sc=new Scanner(System.in);
  int speed,price;
  String color,name,mop;
    
  void getdetail() {
	 
	  System.out.println("enter the name,color,speed,price");
	  name=sc.next();
	  color=sc.next();
	  speed=sc.nextInt();
	  price=sc.nextInt();
  }
   void discount() {
	   float discount;
	   System.out.println("enter the mode of payment online/cash");
	   mop=sc.next();
	   if(mop.equalsIgnoreCase("Online")) {
		   discount=price*0.02f;
		  
		 System.out.println("discount : "+discount);  
		 System.out.println("New Price : "+(price-discount));
	   }
   }
     
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car c=new Car();
       c.getdetail();
       c.discount();
	}

}
