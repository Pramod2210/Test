package ExceptionhAssignment;
//2.WAP to show throw and throws keyword.
public class ThrowAndThrows {
	int a=2;
	
	int c;

	int division1(int b) throws ArithmeticException  {
		
			if(b==0) {
				throw new ArithmeticException("Value of b is zero");
			}
		
		
		return c;
		
	}

	/*
	 * int division(int b) { try { c=a/b; System.out.println(c);
	 * 
	 * } catch(ArithmeticException e) { System.out.println(e); } return c; }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowAndThrows t=new ThrowAndThrows();
	//t.division(2);
	System.out.println(t.division1(0));
	}
}

