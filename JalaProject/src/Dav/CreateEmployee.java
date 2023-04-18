package Dav;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Pojo.Address;
import Pojo.Employee;

public class CreateEmployee {
	Connection con;
	PreparedStatement pst;
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> emp = new ArrayList<>();

	public void insert(Connection con, ArrayList<Employee> emp) {
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("First name");
		String firsname = sc.next();
		System.out.println("Last name");
		String lastname = sc.next();
		System.out.println("Enter mobile number");
		String mobileno = sc.next();
		String mobileno1;
		if (mobileno.length() > 10 || (mobileno.length() < 10)) {
			System.out.println("No is invalid please enter valid number");
			mobileno1 = sc.next();
		} else {
			mobileno1 = mobileno;
		}
		System.out.println("Enter email Id");
		String email = sc.next();
		System.out.println("enter gender");
		String gender = sc.next();
		System.out.println("entrer date in yyyy-mm-dd");
		
		String birthdate = sc.next();
		
		System.out.println("enter Address");
		String address = sc.next();
		System.out.println("enter Country");
		String country = sc.next();
		System.out.println("enter state");
		String state = sc.next();
		System.out.println("enter city");
		String city = sc.next();

		Address a = new Address();
		a.setAddress(address);
		a.setCountry(country);
		a.setState(state);
		a.setCity(city);

		Employee e = new Employee();
		e.setFirst_name(firsname);
		e.setLast_name(lastname);
		e.setMobile_no(mobileno1);
		e.setEmail(email);
		e.setBirth_date(birthdate);
		e.setGender(gender);
		e.setA(a);

		try {
			pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setNString(2, firsname);
			pst.setNString(3, lastname);
			pst.setNString(4, mobileno1);
			pst.setString(5, email);
			pst.setString(6, gender);
			pst.setString(7, birthdate);
			pst.setString(8, address);
			pst.setString(9, country);
			pst.setString(10, city);
			int i = pst.executeUpdate();
			if (i != 0) {
				System.out.println("Saved succesfully");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
