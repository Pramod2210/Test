package AssignmentInheritance;

public class Animal {
	void display() {
		System.out.println("eat grass");
	}

}
class Dog extends Animal{
	void display() {
		System.out.println("eat bread");
	}
}
