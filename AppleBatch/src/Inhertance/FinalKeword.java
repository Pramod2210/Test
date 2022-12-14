package Inhertance;

 class Word{
	 final int a=100;
	 final void display() {
		 System.out.println("in display method");
	 }
	
}
public class FinalKeword extends Word{
	
	void display1() {
		System.out.println("in display "+a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalKeword f=new FinalKeword();
		f.display();
		f.display1();
	}

}
