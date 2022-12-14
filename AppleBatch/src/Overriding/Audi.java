package Overriding;

public class Audi extends Swift {
	
	void dashbord() {
		super.dashbord();
		System.out.println("the car with tv");
	}
	

	void Airbag() {
		super.Airbag();
		System.out.println("4 airbag");
	}
}

