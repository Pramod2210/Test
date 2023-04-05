package Test;

import java.sql.Connection;

import Dav.Operation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Connection con=DbConnection.getconnection();
      
      System.out.println("**** WelCome to Vaccination Booking page***-*** ");
      
      Operation o = new Operation();
      o.bookvacinatation(con);
	}

}
