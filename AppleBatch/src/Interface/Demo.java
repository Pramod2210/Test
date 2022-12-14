package Interface;

public interface Demo {
	final int b=100;
   final static int a=100;
      
   default void display() {
	   result();
	   System.out.println("display one");
   }
   
   static void result() {
	   System.out.println(a);
	   System.out.println("12356");
	   
   }
   default void run() {
	
	   
	  
	   
   }
}
