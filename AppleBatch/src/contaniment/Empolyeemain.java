package contaniment;

public class Empolyeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mydate m=new Mydate(22,"december",1998);
	    EDepartment ed=new EDepartment(1,"mech");
		Empolyee e=new Empolyee(1, 12500,"pratic", m, ed); 
	
		
		/*m.setDay(22);
		m.setMonth("december");
		m.setYear(1998);
		ed.setDept_id(1);
		ed.setDept_name("Quality");
		e.setId(15);
		e.setName("rakesh");
		e.setSalary(18000);
		e.setEd(ed);
		e.setM(m);*/
			
		System.out.println(e);
	}

}
