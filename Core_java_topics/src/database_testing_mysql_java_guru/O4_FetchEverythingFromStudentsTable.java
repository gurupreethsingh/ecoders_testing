package src.database_testing_mysql_java_guru;

import java.sql.*;

public class O4_FetchEverythingFromStudentsTable {

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
				PreparedStatement ps = conn.prepareStatement("select * from students");
				
				ResultSet rs = ps.executeQuery();
				
				System.out.println("All rows and colomns from students table are,\n");
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1) +" | " + rs.getString(2)+" | " + rs.getString(3));
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
