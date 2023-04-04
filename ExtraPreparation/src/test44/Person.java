package test44;

public class Person {

	private int id;
	private String pname;
	 Address a;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", a=" + a + "]";
	}
	
}
