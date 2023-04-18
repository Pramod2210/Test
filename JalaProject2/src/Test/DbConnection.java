package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	static String driver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/jalaemployee";
	static String username = "root";
	static String password = "Pramod";

	static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			System.out.println("driver Exhausted !!");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection extablished !!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}
}
