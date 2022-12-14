package abstraction;

public abstract class Car {
	int price, engine;
	
 void Swift(int price,int engine){
		this.price=price;
		this.engine=engine;
	}
	void wheel() {
		System.out.println("2wheel");
	}
	void door() {
		System.out.println("4 door");
	}
	void display() {
		System.out.println("price :"+price+"\nEngine :"+engine);
	}

	
	abstract void milage();


}
