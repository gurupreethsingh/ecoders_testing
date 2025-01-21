package database_testing_mysql_java_sneha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class O4_FetchEverythingFromempTable 
{
	public static void main(String[] args) 
	{
	 Connection conn=null;	
     try 
         {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoders", "root", "root");
	         
	         if(conn==null)
	         {
	        	 System.out.println("unable to connect Mysql");
	         }
	         else
	         {
	        	 System.out.println("successfully connected to Mysql");
	        	 PreparedStatement ps=conn.prepareStatement("select * from emp");
	        	 
	        	ResultSet rs=ps.executeQuery();
	        	
	        	System.out.println("All rows and columns from emp table are, \n");
	        	
	        	while(rs.next())
	        	{
	        		System.out.println(rs.getInt(1) +" | " + rs.getString(2) +" | " + rs.getString(3) +" | " + rs.getInt(4) +" | " + rs.getInt(5) +" | " + rs.getInt(6) +" | " + rs.getInt(7));
	        	}
	         }
          }
      catch(Exception ex)
           {
	           ex.printStackTrace(); 
	       }
}
}