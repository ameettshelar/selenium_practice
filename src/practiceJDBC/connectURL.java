package practiceJDBC;
import java.sql.*;

public class connectURL {

	public static void main(String[] args) {
		
		System.out.println("1");
		
		//Create connection string
		String conURL="jdbc:sqlserver://localhost:49165;"+"databaseName=AdventureWorks2014;integratedSecurity=true";
		
		//Declare JDBC objects
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try 
		{
			//Load the class
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("2");
			
			con=DriverManager.getConnection(conURL, "sa", "ameett15a");
			System.out.println("3");
			
			String sqlSelect="select * from Production.Location";
			stmt=con.createStatement();
			rs=stmt.executeQuery(sqlSelect);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"   "+rs.getString(2));
			}
			rs.close();
			stmt.close();
			con.close();
			System.out.println("4");
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		

	}

}
