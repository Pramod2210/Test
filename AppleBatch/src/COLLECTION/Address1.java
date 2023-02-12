package COLLECTION;

public class Address1 {
    String city,state,country;
    Address1(String city,String state,String country){
    	this.city=city;
    	this.state=state;
    	this.country=country;
    }
	@Override
	public String toString() {
		return "Address1 city=" + city + ", state=" + state + ", country=" + country;
	}
    
}
