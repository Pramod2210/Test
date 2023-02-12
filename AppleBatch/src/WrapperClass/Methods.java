package WrapperClass;

public class Methods {
	
	void display(int a) {
		System.out.println("int");
	}
	void display(float a) {
		System.out.println("float");
	}
	void display(Integer a) {
		System.out.println("Integer");
	}
	void display(Float a) {
		System.out.println("Float");
	}
	void display(Number a) {
		System.out.println("Number");
	}
	void display(long a) {
		System.out.println("long");
	}
	void display(Long a) {
		System.out.println("Long");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Methods m=new Methods();
   m.display(100);
   
   // comment one by one method and see how program execute
	}

}
