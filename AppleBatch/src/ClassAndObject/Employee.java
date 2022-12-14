package ClassAndObject;

import java.util.Scanner;

public class Employee {

	int id, salary, contact;
	String name, email, dept;

	void setdata(int eid, String ename, String edept, int esalary, int econtact, String eemail) {
		id = eid;
		name = ename;
		dept = edept;
		salary = esalary;
		contact = econtact;
		email = eemail;

	}

	void display() {
		System.out.println(id + " " + name + " " + dept + " " + salary + " " + contact + " " + email);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of employee");
		int n = sc.nextInt();
		Employee e = new Employee();
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the id");
			int ed1 = sc.nextInt();
			System.out.println("enter the name");
			String ename = sc.next();
			System.out.println("enter the dept");
			String edept = sc.next();
			System.out.println("enter the salary");
			int esalary = sc.nextInt();
			System.out.println("enter the contact");
			int econtact = sc.nextInt();
			System.out.println("enter the email");
			String eemail = sc.next();

			e.setdata(ed1, ename, edept, esalary, econtact, eemail);
			System.out.println("------****** employee detail *****-------");
			e.display();
		}
	}
}
