package Myexamo;

public class Course {
	int id;
	String cname;
	int fee;
	public Course(int id, String cname, int fee) {
		super();
		this.id = id;
		this.cname = cname;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Cource [id=" + id + ", cname=" + cname + ", fee=" + fee + "]";
	}
	
}
