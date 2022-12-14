package Interface;

public class SciCalculator implements Calculator {


	public void addition (int a,int b) {
		System.out.println("Addition"+(a+b));
		
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("Multiplication");
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("division");
	}

	@Override
	public void substraction() {
		// TODO Auto-generated method stub
		System.out.println("substraction");
	}
    void power() {
    	System.out.println("power");
    }
    void sqrt() {
    	System.out.println("sqrt");
    }
    void square() {
    	System.out.println("square");
    }

	
}
