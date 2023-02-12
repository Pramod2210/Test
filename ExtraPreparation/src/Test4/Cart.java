package Test4;
	import java.util.Scanner;

	/*6. Cart class is as follows cart { int itemno , String name , int qty , int rate }
	Take input from user to create cart object. Assign values to car object using parameterised
	constructor.
	If total price of item is > 1000 give discount of 100 rs. If total price is > 900 discount is
	= 80 . if total price is > 600 check if itemno is 111 give discount 50 rs if price is > 600 and item
	is not 111 discount is 40. For all others discount is 20 .
	Using ternary operator find out discount. Display discount. Total price is qty * rate. [1m]*/
	public class Cart {
	     int itemno,qty,rate;
	     String name;
		 Cart (int itemno , String name , int qty , int rate )
		 {
			 this.itemno = itemno;
			 this.name = name;
			 this.qty = qty;
			 this.rate = qty;
		 }
		 void discount(int itemno,int qty,int rate)
		 {
			 int total_price = qty * rate;
			 
			String discount = total_price > 1000
					? "discount of 100rs": total_price > 900 
					 ?"discount of 80 rs ": total_price > 600 ? itemno == 111 
					  ? "discount 50 rs ":"discount 40 rs":"discount 20 rs" ;
					 
					 System.out.println(discount);
			 
		 }

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter itemno,name,qty,rate ");
			int itemno = sc.nextInt();
			String name = sc.next();
			int qty = sc.nextInt();
			int rate = sc.nextInt();
			
			Cart c = new Cart(itemno,name,qty,rate);
	        c.discount(itemno, qty, rate);
		}

	}

