package groupPractice;

public class Person extends C  implements A,B{


	public void dinner() {
		// TODO Auto-generated method stub
		System.out.println("dinner");
	}

	@Override
	public void doisplay() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

	@Override
	public void main() {
		// TODO Auto-generated method stub
		System.out.println("main");
	}
	
	public static void main(String[] args) {
		Person p=new Person();
				p.calling();
				p.dinner();
				p.doisplay();
				p.main();
				
	}
}
