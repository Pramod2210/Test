package Overriding;

public class Doctor extends Person {

	int id;
	String specialist,lisence;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public void setLisence(String lisence) {
		this.lisence = lisence;
	}
	
	void display() {
		super.display();
		System.out.println("id : "+id+"\nspecilist : "+specialist+"\nlisence : "+lisence);
	}
}
