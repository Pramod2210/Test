package Interface;

public class Demo1 implements Demo  {
	
	void sup() {
		System.out.println("fit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Demo1 d=new Demo1();
     d.sup();
     d.display();
    System.out.println(Demo1.a);
	}

}
