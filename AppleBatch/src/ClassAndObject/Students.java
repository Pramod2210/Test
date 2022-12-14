package ClassAndObject;

import java.util.Scanner;

public class Students {
	int id, marks;
	String name, dept;

	void setdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		id = sc.nextInt();
		System.out.println("enter the name");
		name = sc.next();
		System.out.println("enter the marks");
		marks = sc.nextInt();
		System.out.println("enter the department");
		dept = sc.next();
	}

	/*
	 * void display() { System.out.println(id + " " + name + " " + marks + " " +
	 * dept); }
	 */
	
	public String toString() {
		return id + " " + name + " " + marks + " " + dept;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();

		s1.setdata();
		s2.setdata();
		s3.setdata();
		System.out.println(s1+"\n"+s2+"\n"+s3);

		/*
		 * s1.display(); s2.display(); s3.display();
		 */
	}

}
