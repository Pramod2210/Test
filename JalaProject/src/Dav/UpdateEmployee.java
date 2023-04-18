package Dav;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {
	Connection con;
	PreparedStatement pst;
	Scanner sc = new Scanner(System.in);

	public void update(Connection con) {
		char ch;
		do {
			System.out.println("Enter the id no where u have update data");
			int id = sc.nextInt();

			System.out.println(
					"1 update Fist name\n2)update lastname\n3)mobile no\n4)email\n5)gender\n6)Birthdate\n7)address\n8)country\n9)city");
			System.out.println("enter the sr no");
			int k = sc.nextInt();
			switch (k) {
			case 1: {
				try {
					pst = con.prepareStatement("update employee set First_name =? where id=? ");
					System.out.println("enter new name");
					String fname = sc.next();
					pst.setString(1, fname);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 2: {
				try {
					pst = con.prepareStatement("update employee set Last_name =? where id=? ");
					System.out.println("enter new name");
					String lname = sc.next();
					pst.setString(1, lname);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 3: {
				try {
					pst = con.prepareStatement("update employee set Mobile_no =? where id=? ");
					System.out.println("enter new number");
					String num = sc.next();
					pst.setString(1, num);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 4: {
				try {
					pst = con.prepareStatement("update employee set Email_id =? where id=? ");
					System.out.println("enter new email");
					String email = sc.next();
					pst.setString(1, email);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 5: {
				try {
					pst = con.prepareStatement("update employee set gender =? where id=? ");
					System.out.println("enter new gender");
					String gender = sc.next();
					pst.setString(1, gender);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 6: {
				try {
					pst = con.prepareStatement("update employee set Brthdate =? where id=? ");
					System.out.println("enter new Date of birth in yyyy-mm-dd");
					String dob = sc.next();
					pst.setString(1, dob);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 7: {
				try {
					pst = con.prepareStatement("update employee set adress =? where id=? ");
					System.out.println("enter new address ");
					String add = sc.next();
					pst.setString(1, add);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 8: {
				try {
					pst = con.prepareStatement("update employee set Country =? where id=? ");
					System.out.println("enter new Country");
					String cont = sc.next();
					pst.setString(1, cont);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 9: {
				try {
					pst = con.prepareStatement("update employee set City =? where id=? ");
					System.out.println("enter new City");
					String city = sc.next();
					pst.setString(1, city);
					pst.setInt(2, id);
					int i = pst.executeUpdate();
					if (i != 0) {
						System.out.println("Updated Succesfully");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			default: {
				System.out.println("invalid Id");
			}
			}
			System.out.println("Do you want to update any othe detail enter Y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
	}
}
