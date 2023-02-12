package ExtraLecture;

import java.util.ArrayList;

public class Employeemain {
	
	
	void setdata(ArrayList<Employee>e)
	{
	   e.add( new Employee(1,"pramod",10000));
	   e.add( new Employee(2,"pravin",20000));
	   e.add( new Employee(3,"pratik",30000));
	   e.add( new Employee(4,"raj",40000));
		System.out.println(e);
	}
	void update(ArrayList<Employee>e) {
		for(Employee x:e) {
			if(x.salary<20000) {
			x.salary=x.salary+1000;
			}
		}
		System.out.println(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>e= new ArrayList<>();
		Employeemain m=new Employeemain();
		m.setdata(e);
		m.update(e);
	}

}
