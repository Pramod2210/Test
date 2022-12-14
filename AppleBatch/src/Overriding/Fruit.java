package Overriding;

public class Fruit {
 
	void taste() {
		System.out.println("fruits are aalways sweet");
	}
}
class apple extends Fruit{
	 void taste() {
		 System.out.println("apple is sweet");
	 }
}
class grapes extends Fruit{
	void taste() {
		System.out.println("grapes are sour");
	}
}
