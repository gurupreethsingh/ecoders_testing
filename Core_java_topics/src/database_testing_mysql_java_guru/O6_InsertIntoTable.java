package src.database_testing_mysql_java_guru;

import java.sql.*;
import java.util.Scanner;

public class O6_InsertIntoTable {

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
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter a name");
				String name = sc1.nextLine();
				
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter a email");
				String email = sc2.nextLine();
				
				PreparedStatement ps = conn.prepareStatement("insert into students (name, email) values (?, ?)");		
				ps.setString(1, name);
				ps.setString(2,  email);
				
				int result = ps.executeUpdate();
				
				if(result >= 0)   // -1 means not created, 0 means created
				{
					System.out.println("Values inserted into the Table successfully.");
				}
				else
				{
					System.out.println("unable to insert values into the table.");
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
