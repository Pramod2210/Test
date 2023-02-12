package MapAssignment;

public class Fariture {
   int price;
   String name;
public Fariture(int price, String name) {
	

	this.price = price;
	this.name = name;
}
@Override
public String toString() {
	return "price:" + price + ", name :" + name +"\n";
}
   
}
