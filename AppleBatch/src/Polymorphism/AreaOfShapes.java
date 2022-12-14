package Polymorphism;

public class AreaOfShapes {
	
	void area(int a) {
		System.out.println("Area of square : "+(a*a));
	}
	void area(int h,int b) {
		System.out.println("Area of triangle : "+(h*b)/0.5);
	}
	void area(int a,float b) {
		System.out.println("Area of  Rectangle : "+(a*b));
	}
	void area(int a,int b,int c) {
		System.out.println("Area of Circle : "+(a*b*c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfShapes a=new AreaOfShapes();
		a.area(20, 2.5f);
		a.area(20);
		a.area(2,5);
		a.area(10,12,5);
	}

}
