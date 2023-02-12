package Mapdemo;

public class OrderStatus {
   String deliverydate,ststus;

public OrderStatus(String deliverydate, String ststus) {
	super();
	this.deliverydate = deliverydate;
	this.ststus = ststus;
}

@Override
public String toString() {
	return "OrderStatus [deliverydate=" + deliverydate + ", ststus=" + ststus + "]";
}
   
	
}
