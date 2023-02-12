package Mapdemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Employeemain {
	
	void setdata(ArrayList<Employee>e) {
		e.add(new Employee("pramod","mech","98000",1));
		e.add( new Employee("Rahukl","it","88000",5));
		e.add( new Employee("Prera","comp","96000",6));
		e.add( new Employee("Duksh","mech","98000",45));
		e.add( new Employee("Raj","mech","98000",50));
		e.add( new Employee("ravi","entc","95000",84));
		e.add( new Employee("raki","mech","98000",56));
		e.add( new Employee("Atul","civil","78000",4));
		e.add( new Employee("baba","it","48000",6));
		e.add( new Employee("dilip","comp","58000",89));
		
	}
	
	void creatmap(ArrayList<Employee>e,HashMap<String,Integer>hm) {
		 for(Employee e2:e) {
			 String dept=e2.dept;
			if(hm.containsKey(dept)) {
					int i=hm.get(dept);
					hm.put(dept, i+1);
			}
			else {
				hm.put(dept, 1);
			 }
		 }
	}
	
	/*void salary(ArrayList<Employee>e,HashMap<String,Integer>hm1) {
		 for(Employee e3:e) {
			 String salary=e3.salary;
			 if(hm1.containsKey(salary)) {
				 hm1.put(salary, hm1.get(salary)+1);
			 }
			 else {
				 hm1.put(salary, 1);
			 }
		 }
	}*/

	void salary(ArrayList<Employee>e,HashMap<Integer,Employee>hm1) {
		 for(Employee e3:e) {
			//String salary=e3.salary;
			 if(e3.salary.equals("98000")) {
			   hm1.put(e3.id, e3);
			 }
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Employee>a=new ArrayList<>();
    HashMap<String,Integer>hm=new HashMap<>();
    Employeemain e5=new Employeemain();
    e5.setdata(a);
    e5.creatmap(a, hm);
    System.out.println(hm);
    HashMap<Integer,Employee>hm1=new HashMap<>();
     e5.salary(a, hm1);
    System.out.println(hm1);
	}

}
