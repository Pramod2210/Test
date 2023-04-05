package WrittenTestArraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> a = new LinkedList<>();
		Employee e = new Employee();
		e.setId(1);
		e.setName("pramod");
		e.setDept("it");
		a.add(e);

		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("pravin");
		e1.setDept("it");
		a.add(e1);
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("atif");
		e3.setDept("mech");
		a.add(e3);
		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("raj");
		e4.setDept("comp");
		a.add(e4);
		Employee e5 = new Employee();
		e5.setId(5);
		e5.setName("priti");
		e5.setDept("it");
		a.add(e5);
      String s=a.get(2).getDept();  // 2 indicate the employee index number which one compare  
     System.out.println(s);
	  for(int i=0;i<a.size();i++) {
		  if(i!=2) {     //// 2 indicate the employee index number which one compare  
		  if(a.get(i).getDept().equalsIgnoreCase(s)) {
			  a.remove(i);
	}
		  else {
			  System.out.println(a.get(i));
		  }
}
	}
}
}