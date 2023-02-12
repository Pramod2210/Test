package Mapdemo;

public class Address {
  String city, State;

public Address(String city, String state) {
	super();
	this.city = city;
	State = state;
}

@Override
public String toString() {
	return "Address [city=" + city + ", State=" + State + "]";
}
  
}
