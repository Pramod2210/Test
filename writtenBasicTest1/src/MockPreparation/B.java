package MockPreparation;

public class B  extends A{
	public B getObj() {
	
		System.out.println("b is derived");
		return new B();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          B b=new B();
          b.getObj().getObj();
           A a= new A();
           a.getObj();
	}

}
