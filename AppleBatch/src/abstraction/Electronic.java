package abstraction;

public  abstract class Electronic {
  String price,color,weight;
  
  Electronic(String price,String color,String weight){
		this.color=color;
	this.price=price;
	this.weight=weight;
	  System.out.println(color+price+weight);
	}
  
  void processor() {
	  System.out.println("android");
  }
  void semiconductor() {
	  System.out.println("component");
  }
   abstract void rating();
   abstract void electricConsumption();
   abstract void features();
   
}
