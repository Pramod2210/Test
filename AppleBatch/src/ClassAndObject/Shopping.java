package ClassAndObject;

import java.util.Scanner;

public class Shopping {
	String name;
	int quantity,price,b;

	int  item(String  n, int p, int q) {
		name=n;
		price=p;
		quantity=q;
		return price;
				}
	
	int bill(int prs) {
		int x=5;
		int b= x*prs;
		return b;		
	}

	/*
	 * void show() {
	 * 
	 * System.out.println("name : "+name+"\nprice:  "+price+"\nquantity : "+quantity
	 * ); //System.out.println("the bill is : "+b); }
	 */
	public String toString()
	{
		return "name : "+name+"\nprice:  "+price+"\nquantity : "+quantity;
		
	}
	

	public static void main(String[] args) {
	  
		Shopping s=new Shopping();
		int prs=s.item("pramod", 10, 5);
		int b=s.bill(0);
		System.out.println(s);
     
	}

}
