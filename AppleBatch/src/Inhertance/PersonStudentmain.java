package Inhertance;

public class PersonStudentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s=new Student();
       s.setId(1);
       s.setName("pratik");
       s.setContact("12154689");
       s.setAge(15);
       s.setCollagename("jspm");
       s.setPercent(90);
       System.out.println(s.getAge()+" ,"+s.getId()+" ,"+s.getContact()+" ,"+s.getName());
       s.graead();
       System.out.println(s);
       
       
       Employee e=new Employee();
       e.setId(12);
       e.setName("pravin");
       e.setContact("12564");
       e.setAge(22);
       e.setDept("hr");
       e.setSalary(78000);
       e.pf();
       System.out.println(e);
	}

}
