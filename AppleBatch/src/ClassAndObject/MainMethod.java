package ClassAndObject;

import java.util.Scanner;

public class MainMethod {
	int id, marks;
	String name, dept;

	void setdata(int i, String n, int m, String d) {
		id = i;
		name = n;
		marks = m;
		dept = d;
	}

	void display() {
		System.out.println(id + " " + name + " " + marks + " " + dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		for(int i=1;i<=2;i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int sid = sc.nextInt();
		System.out.println("enter the name");
		String sname = sc.next();
		System.out.println("enter the marks");
		int smarks = sc.nextInt();
		System.out.println("enter the department");
		String sdept = sc.next();

		MainMethod s1 = new MainMethod();
		
		s1.setdata(sid, sname, smarks, sdept);
		s1.display();
		
		}
		/*System.out.println("enter the id");
		sid = sc.nextInt();
		System.out.println("enter the name");
		sname = sc.next();
		System.out.println("enter the marks");
		smarks = sc.nextInt();
		System.out.println("enter the department");
		sdept = sc.next();
*/
		//MainMethod s2 = new MainMethod();
		//s2.setdata(sid, sname, smarks, sdept);

		/*
		 * s1.display(); s2.display();
		 */

	}
}
