package Overriding;

public class Swift extends Car {
	void dashbord() {
		super.dashbord();
		System.out.println("the car with tv and radio");
	}
	
   static void wheel() {
	   System.out.println("wheel 6");
	  
  }
	void Airbag() {
		super.Airbag();
		System.out.println("2 airbag");
	}
}
