package contaniment;

public class Person {
 int id;
 String name,contact,email;
 Address a;
 
 Person(int id,String name,String contact,String email, Address a){
	 this.id=id;
	 this.name=name;
	 this.contact=contact;
	 this.email=email;
	 this.a=a;
	 
 }
 public String toString() {
	 return "id "+id+" name "+name+" contact "+contact+" email "+email+"\n "+a;
	
 }
}
