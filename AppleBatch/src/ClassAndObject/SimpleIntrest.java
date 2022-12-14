package ClassAndObject;

public class SimpleIntrest {
         void intrest(int p, float r,int t) {
        	float s=(p*r*t)/100;
        	 System.out.println("the simple intrest is: "+s);
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SimpleIntrest c=new SimpleIntrest();
     c.intrest(15000,2.5f, 1);
	}

}
