package Dav;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
	Connection con;
	PreparedStatement pst;
	Scanner sc = new Scanner(System.in);

	public void delete(Connection con) {
		try {
			pst = con.prepareStatement("delete * from employee where id=?");
			System.out.println("enter id no which u want to delete");
			int id = sc.nextInt();
			pst.setInt(1, id);

			int i = pst.executeUpdate();
			if (i != 0) {
				System.out.println("Delete Succesfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}