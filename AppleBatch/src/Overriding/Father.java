package Overriding;

public class Father extends GrandFather {
	String fathername ;

	

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}



	void Display() {
		super.Display();
		System.out.println("----Father detail---");
		System.out.println("first name :"+fathername+"\n middle name : "+super.fn+"\n last name : "+GrandFather.ln);
	}
}
