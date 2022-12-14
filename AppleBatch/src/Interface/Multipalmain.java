package Interface;

interface A{
	void add(int a,int b);
	void square (int a);
	static int x=100;
}
interface B{
	static void square(int a) {
		System.out.println("square is "+a);
	}
	
}
class ABC implements A,B{

	@Override
	public
	 void add(int a, int b) {
		System.out.println("addition of a+b "+(a+b));
		
	}

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println("square "+Math.sqrt(a));
	}
	
}




public class Multipalmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ABC a=new ABC();
     a.add(15, 15);
     a.square(49);
     System.out.println(A.x);
	}

}
