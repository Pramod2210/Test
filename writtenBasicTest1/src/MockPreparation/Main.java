package MockPreparation;
public class Main{
public class A {
  public A getShape() {
	  System.out.println("base is derived");
	return new A();
	  
  }
}
  
  public class B extends A{
	  public B getShape() {
		  System.out.println("paraent is derived");
		return new B();
	  }
  }
  
   public static void main(String args[]) {
	   
	  B b=new B();
	   
   }
	
	 
	  
}

