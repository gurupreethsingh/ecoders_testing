package database_testing_mysql_java_guru;

import java.sql.*;

public class O1_ConnectToMysql {

	public static void main(String[] args)
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306" ,  "root", "root");
			
			if(conn == null)
			{
				System.out.println("Unable to connect to Mysql.");
			}
			else
			{
				System.out.println("Succesfully connected to Mysql");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
