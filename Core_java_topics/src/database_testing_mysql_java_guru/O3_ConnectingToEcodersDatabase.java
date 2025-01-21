package src.database_testing_mysql_java_guru;

import java.sql.*;

public class O3_ConnectingToEcodersDatabase {

	public static void main(String[] args)
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoders" ,  "root", "root");
			
			if(conn == null)
			{
				System.out.println("Unable to connect to Mysql.");
			}
			else
			{
				System.out.println("Succesfully connected to Mysql");
				PreparedStatement ps = conn.prepareStatement("show tables");
				
				ResultSet rs = ps.executeQuery();
				
				System.out.println("All Tables in ecoders database are,");
				
				while(rs.next())
				{
					System.out.println(rs.getString(1));
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
