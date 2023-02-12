package Poly;

public class Main {
	
	/*Polymorphism - method overloading and over-riding, compile time and run time
	polymorphism
	1. WAJP2 create a class Kid with method readBook() and another method
	readBook () with 2 parameters. The method readBook here is over-loaded (same
	method name but different parameters)
	2. Create a class BigKid which extends Kid created above. Implement readBook()
	differently in BigKid class. Here the method readBook() has been over-ridden in
	the child class BigKid()
	3. Create a class Teenager which extends Kid created above (#14). Implement
	readBook() differently in Teenager class. In main method, declare 2 variables k1,
	k2 of type Kid. Create objects of type BigKid and Teenager such that K1 should
	reference object of class BigKid and K2 should reference object of class Teenager.
	Call their respective readBook() methods. The output is different from both the
	method calls even if the variable type is the same i.e. Kid. This is compile time
	polymorphism example*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       BigKid k1=new BigKid();
       Teenager k2=new Teenager();
       k1.Readbook();
       k1.Readbook(0, 0);
       k2.Readbook();
       k2.Readbook(10, 15);
	}

}
