package contaniment;

public class Student {
	private int Roll_No;
	private String name;
	Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public int getRoll_No() {
		return Roll_No;
	}

	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student Roll_No=" + Roll_No + ", name=" + name + ", dept=" + dept;
	}

}
