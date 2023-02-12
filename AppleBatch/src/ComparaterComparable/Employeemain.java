package ComparaterComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Employeemain {

	void setdata(ArrayList<Employee>e) {
		e.add(new Employee(1,"pramod","mech","75800",'A'));
		e.add(new Employee(12,"amar","it","65000",'C'));
		e.add(new Employee(33,"pratik","9545443151","98000",'A'));
		e.add(new Employee(14,"baba","comp","65400",'B'));
		e.add(new Employee(5,"prem","it","49800",'A'));
		e.add(new Employee(6,"amit","mech","50000",'A'));
		e.add(new Employee(17,"krushna","mech","450000",'A'));
		e.add(new Employee(81,"sahil","civil","58000",'A'));
		e.add(new Employee(99,"karik","it","56000",'B'));
		e.add(new Employee(10,"ravan","entc","50000",'A'));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Employee>e=new ArrayList<>();
      Employeemain e1=new Employeemain();
      e1.setdata(e);
      System.out.println(e);
      System.out.println("\n------------***********-------------");
      Collections.sort(e);
      System.out.println(e);
	}

}
