package MapWrittentest;

public class Item {
 int id,quantity;
 String name;
 double price;
public Item(int id,  String name, double price,int quantity) {
	
	this.id = id;
	
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Item [id=" + id + ", quantity=" + quantity + ", name=" + name + ", price=" + price + "]";
}
 
 
}
