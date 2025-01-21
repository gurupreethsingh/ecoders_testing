package database_testing_mysql_java_sneha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class O3_ConnectingToEcodersDatabase 
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
	        	 PreparedStatement ps=conn.prepareStatement("show tables");
	        	 
	        	ResultSet rs=ps.executeQuery();
	        	
	        	System.out.println("All tables in ecoders database are");
	        	
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
