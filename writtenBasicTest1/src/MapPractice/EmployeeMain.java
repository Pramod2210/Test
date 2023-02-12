package MapPractice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeMain {
void set(LinkedList<Employee>a) {
	for(Employee e:a) {
		if(e.a.city=="pune") {
			e.salary=e.salary+1000;
		System.out.println(e);
		}
	}
	//System.out.println(a);
}

void date(LinkedList<Employee>a) {
	
	Iterator<Employee>it=a.iterator();
	while(it.hasNext()) {
		Employee x=it.next();
		if(x.a.city.equals("pune")) {
			System.out.println(x);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Employee>a=new LinkedList<>();
       a.add(new Employee(4,"pramod","mech",78000,new Address("pune","Maharashtra","akurdi")));
		a.add(new Employee(16,"pramod","it",65000,new Address("gulbarga","karnataka","Watertank")));
		a.add(new Employee(18,"amar","comp",88000,new Address("Sangli","Maharashtra","vishrambag")));
		a.add(new Employee(11,"dilip","mech",78000,new Address("solapur","Maharashtra","akurdi")));
		a.add(new Employee(1,"raki","civil",45000,new Address("bijapur","karnataka","akurdi")));
		a.add(new Employee(15,"atif","mech",56000,new Address("pune","Maharashtra","akurdi")));
		a.add(new Employee(35,"raj","comp",60000,new Address("jaipur","Rajstan","rawatvilla")));
		//Collections.sort(a);
		EmployeeMain en=new EmployeeMain();
		en.set(a);
		System.out.println("*******----------//////***********");
		en.date(a);
	//	System.out.println(a);
	}

}
