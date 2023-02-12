package MapPractice;

public class Address {
  String city,state,area;

public Address(String city, String state, String area) {
	super();
	this.city = city;
	this.state = state;
	this.area = area;
}

@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", area=" + area + "]";
}
 


}
  

