package InheratanceAndPoly;

public class X {
  void display() {
	  System.out.println("x");
 
  }
}
class Y extends X{
	void display () {
		super.display();
		System.out.println("y");
	}
}
