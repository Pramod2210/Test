package AbstractAssignment;

public class Mastani implements Icecreem,Juice{
	

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("i deink Juice by using straw");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("i eat mango");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mastani m=new Mastani();
     m.drink();
     m.eat();
	}


}
