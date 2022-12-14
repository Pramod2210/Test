package abstraction;

public class Swift extends Car {
	int price, engine;
	
	Swift(int price,int engine){
		this.price=price;
		this.engine=engine;
	}
	void milage() {
		System.out.println("65");
	}
	void milage(int a) {
		System.out.println("85");
	}
	void display() {
		super.display();
		System.out.println("price :"+price+"\nEngine :"+engine);
	}
	
}
