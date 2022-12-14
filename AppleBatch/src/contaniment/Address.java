package contaniment;

public class Address {
  String area,state,city;
  int pincode;
public Address(String area, String state, String city, int pincode) {
	
	this.area = area;
	this.state = state;
	this.city = city;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address area=" + area + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
}
  
}
