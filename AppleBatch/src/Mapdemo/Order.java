package Mapdemo;

public class Order {
 int id ,totalcost;
 String city;
 OrderStatus o;
public Order(int id, int totalcost, String city, OrderStatus o) {

	this.id = id;
	this.totalcost = totalcost;
	this.city = city;
	this.o = o;
}
public String toString() {
	return "Order [id=" + id + ", totalcost=" + totalcost + ", city=" + city + ", o=" + o + "]";
}
 
 
 
}
