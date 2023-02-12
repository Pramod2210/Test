package Exception;

public class SimpleAritmetic {
	
	
	void add(int a, int b) {
		System.out.println("addition is "+(a+b));
	}
	void sub(int a, int b) {
		System.out.println("substraction is "+(a-b));
	}
	void multi(int a, int b) {
		System.out.println("multiplication is "+(a*b));
	}
	
	void div(int a, int b) {
		try {
		System.out.println("divide  is "+(a/b));
	}
	
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAritmetic s=new SimpleAritmetic();
		int a=150,b=0;
		s.add(a, b);
	/*	try {
			s.div(a, b);
		}
		catch(Exception e) {
			System.out.println(e);
		//	e.printStackTrace();
			
		}*/
		s.sub(a, b);
		s.multi(a, b);
		s.div(a, b);
		
	}
}


