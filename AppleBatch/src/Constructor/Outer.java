package Constructor;

public class Outer {

	int a=10;
	static int b=20;
	private static char[] Inner;
	
	void display() {
		System.out.println(a);
	}
	
	static class Inner{
		void display() {
			System.out.println(b);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Outer.Inner o=new Outer.Inner();
         o.display();
         Outer u=new Outer();
         u.display();
         System.out.println("12345");
	}

}
