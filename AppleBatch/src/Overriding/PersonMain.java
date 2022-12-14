package Overriding;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---***Doctor detail ***----");
		System.out.println();
        Doctor d=new Doctor();
        d.setName("Akash");
        d.setAge(22);
        d.setGender("male");
        d.setContact("235646895");
        d.setId(5124);
        d.setSpecialist("nuero");
        d.setLisence("yes");
        d.display();
        
        System.out.println();
        System.out.println("---*** patient detail***--- ");
        System.out.println();
        Patient p1=new Patient();
        p1.setName("rakesh");
        p1.setAge(22);
        p1.setGender("male");
        p1.setContact("124658");
        p1.setId(12);
        p1.setBedno(5);
        p1.setDisease("maleriya");
     
        p1.display();
	}

}
