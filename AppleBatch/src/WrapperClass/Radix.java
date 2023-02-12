package WrapperClass;

public class Radix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer i=Integer.valueOf(100);
    System.out.println(i);
    
    Integer i1=Integer.valueOf("1234");
    System.out.println(i1);
    
    Integer i3=Integer.valueOf("101",2);
    
    System.out.println(i3);
    
  Long l=Long.valueOf("101", 2);
  System.out.println(l);
  
  Long l1=Long.valueOf(25698556589454l);
  System.out.println(l1);
  
  Long l2=Long.valueOf("2569855658941112");
  System.out.println(l2);
  Float f=Float.valueOf(2.5f);
  System.out.println(f);
  
  
  Float f1=Float.valueOf("2.5f");
  System.out.println(f);
    
	}

}
