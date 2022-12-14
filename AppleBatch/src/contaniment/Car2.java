package contaniment;

public class Car2 {
  String name,price,color;
  Driver d;
  Car2(String name,String price,String color,int did,String dname,String contact ){
	  this.name=name;
	  this.price=price;
	  this.color=color;
	  
	  d= new Driver(did,dname,contact);
  }
  public String toString() {
	  return "name "+name+"  price  "+price+" color "+color+"\n"+d;
  }
}