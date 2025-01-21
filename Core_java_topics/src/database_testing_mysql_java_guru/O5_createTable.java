package database_testing_mysql_java_guru;

import java.sql.*;

public class O5_createTable {

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
				PreparedStatement ps = conn.prepareStatement("create table if not exists contacts (id int(45) auto_increment primary key, name varchar(100) not null, email varchar(100) unique not null)");
				
				int result = ps.executeUpdate();
				
				if(result >= 0)   // -1 means not created, 0 means created
				{
					System.out.println("Table created successfully.");
				}
				else
				{
					System.out.println("unable to create the table.");
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
