package Dav;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchEmployee {
 Connection con;
 PreparedStatement pst;
 Scanner sc= new Scanner(System.in);
 
	public void search(Connection con) {
		 System.out.println("you can search using Firstname and lastname or Mobile number");
		 System.out.println("Press 1 for name\n2 for mobilname");
		 int num=sc.nextInt();
		 switch(num) {
		 case 1:{
			 try {
				pst=con.prepareStatement("select * from employee where First_name=? and Last_name=?");
				System.out.println("enter first name");
				String fname=sc.next();
				System.out.println("ener last name");
				String lname=sc.next();
			pst.setString(1, fname);
			pst.setString(2, lname);
			 
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "
				+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
			}
						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 break;
		 }
		 case 2:{
			 try {
					pst=con.prepareStatement("select * from employee where Mobile_no =?");
					System.out.println("enter Mobile No");
					String Phone=sc.next();
					
				pst.setString(1, Phone);	 
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "
					+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
				}
							
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 break;
		 }
		 }
		
	 }
 }
 

