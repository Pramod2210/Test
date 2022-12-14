package contaniment;

public class DepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Department d= new Department();
      d.setId(1256);
      d.setName("Mechanical");
      
      Student s= new Student();
      s.setRoll_No(1);
      s.setName("Pravin");
      s.setDept(d);
      
      System.out.println(s);
	}

}
