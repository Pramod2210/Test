package Mapdemo;

public class StudentConst {
	
	String name,dept ,mark;

	public StudentConst(String name, String dept, String mark) {
	
		this.name = name;
		this.dept = dept;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "StudentConst [name=" + name + ", dept=" + dept + ", mark=" + mark + "]";
	}
	
}
