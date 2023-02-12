package groupPractice;

interface A {
	
  void doisplay();
  void main();
  default void calling() {
	  A.eating();
	  System.out.println("calling");
  }
  static void eating() {
	  
	  System.out.println("eating");
  }
}
