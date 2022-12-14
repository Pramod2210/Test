package abstraction;

public class Mobile  extends Electronic {
	String pprice,pcolor,pweight;

	Mobile(String pprice,String pcolor,String pweight){
	super("blue","50000","500 fram");
	this.pcolor=pcolor;
	this.pprice=pprice;
	this.pweight=pweight;
	System.out.println(pcolor+pprice+pweight);
	}
	
	void rating() {
		System.out.println("3 star");
	}
	void electricConsumption() {
		System.out.println("350 hz");
	}
	void features() {
		System.out.println("all smart phone features");
	}
   void processer() {
	   System.out.println("os");
   }
   
   void display() {
	   System.out.println("color "+color+"\nprice :"+price+"\nweight : "+weight);
   }
}
