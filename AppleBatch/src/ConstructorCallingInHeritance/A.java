package ConstructorCallingInHeritance;

public class A {
	
	A()
	{
		System.out.println("a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C c1= new C();
	}

}
	 class B extends A {
		 B()
		 {
			 System.out.println("b");
		 }
		 
		 
	 }
	 class C extends B{
		 C()
		 {
			 System.out.println("c");
		 }
	 

	
	

}