package contaniment;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Address a= new Address("akkalkot","Solapur"," Maharashtra",413216);
    Person p= new Person(1,"ram","854697512","abc@198gmail.com", a);
    
    Address a1= new Address("pune","Solapur"," Maharashtra",4154216);
    Person p1= new Person(3,"akash","854697512","abc@198gmail.com", a1);
    
    Address a2= new Address("Kohalurt","barshi"," Maharashtra",44586);
    Person p2= new Person(2,"sita","854697512","abc@198gmail.com", a2);
    
    System.out.println(p+"\n\n"+p1+"\n\n"+p2);
	}

}
