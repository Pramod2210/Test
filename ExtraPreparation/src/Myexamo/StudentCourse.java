package Myexamo;

import java.util.ArrayList;

public class StudentCourse {
	int id;
	String name;
	ArrayList<Course> c;
	public StudentCourse(int id, String name, ArrayList<Course> c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}
	@Override
	public String toString() {
		return "StudentCource [id=" + id + ", name=" + name + ", c=" + c + "]";
	}
	
}
