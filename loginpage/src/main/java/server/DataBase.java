package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	
	public static Connection con;
	public static Connection getconnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser","root","gowtham");
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		return con;
		
	}

	public static void main(String[] args) { 
		

	}

}
