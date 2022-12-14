package Encapsulation;

public class GetMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automatic a=new Automatic();
	  a.setId(1);
		a.setName("pramod");
		a.setSalary(78000);
		a.setDept("mechanical");
		
		System.out.println(a.getId()+" "+a.getName()+" "+a.getSalary()+" "+a.getDept());
	}

}
