package database_testing_mysql_java_sneha;

import java.sql.Connection;
import java.sql.DriverManager;

public class O1_connectToMysql 
{
	public static void main(String[] args) 
	{
	 Connection conn=null;	
     try 
         {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306" , "root", "root");
	         
	         if(conn==null)
	         {
	        	 System.out.println("unable to connect Mysql");
	         }
	         else
	         {
	        	 System.out.println("successfully connected to Mysql");
	         }
          }
      catch(Exception ex)
           {
	           ex.printStackTrace(); 
	       }
 }
}
