package Interface;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Fca f=new Fca();
   f.requirments();
   f.planning();
   f.design();
   f.testing();
   f.deployment();
   f.maintanance();
   f.deadline();
   System.out.println("\n------****bank detail-----****");
    System.out.println();
    Bank b=new Bank();
    b.requirments();
    b.planning();
    b.design();
    b.testing();
    b.deployment();
    b.maintanance();
    b.deadline();
	}

}
