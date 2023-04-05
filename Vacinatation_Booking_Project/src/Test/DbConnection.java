package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    static String driver="com.mysql.cj.jdbc.Driver";
    static String url="jdbc:mysql://localhost:3306/Vacination";
    static String username="root";
    static String password="Pramod";
    
    static Connection getconnection() {
    	Connection con=null;
    	try {
    		Class.forName(driver);
    		System.out.println("driver loaded");
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Extablished");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return con;
    }
}
