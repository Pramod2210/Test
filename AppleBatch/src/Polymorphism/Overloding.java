package Polymorphism;

public class Overloding {

	void add(int a, int b) {
		System.out.println("the addition of two number is :" + (a + b));
	}

	void add(int a, float b) {
		System.out.println("the addition of two number is :" + (a + b));
	}

	void add(String a, int b) {
		System.out.println("the addition of two number is :" + (a + b));
	}

	void add(int a, String b) {
		System.out.println("the addition of two number is :" + (a + b));
	}

	void add(String a, String b) {
		System.out.println("the addition of two number is :" + (a + b));
	}

	void add(String a, float b) {
		System.out.println("the addition of two number is :" + (a + b));
	}

	void add(float a, String b) {
		System.out.println("the addition of two number is :" + (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloding o = new Overloding();
		o.add("ppp", "ccvv");
		o.add(22, 3.2f);
	}

}
