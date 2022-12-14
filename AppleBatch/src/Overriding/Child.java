package Overriding;

public class Child extends Father {
	String Childname;



	

	public void setChildname(String childname) {
		Childname = childname;
	}





	void Display() {
		super.Display();
		System.out.println("----Father detail---");
		System.out.println("first name :"+Childname+"\n middle name : "+super.fathername+"\n last name : "+GrandFather.ln);
	}
}

