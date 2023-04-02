package server;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DBcrud {

	public static int insert(Customer customer)
	{
		int sts=0;
		Connection con=DataBase.getconnection();
		String query="insert into customer(name,email,password)values(?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1,customer.getName());
			ps.setString(2,customer.getEmail());
			ps.setString(3,customer.getPassword()); 
			
			  sts = ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
		return sts;
		
	}
	
}
