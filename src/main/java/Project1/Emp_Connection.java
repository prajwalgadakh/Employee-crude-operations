package Project1;

import java.sql.Connection;
import java.sql.DriverManager;
public class Emp_Connection 
{

	 static Connection con;
	public static Connection dbConnect()
	{
		try 
		{
			if(con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgmt","root","");
			}
			else
			{
				System.out.println("fail")
				;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	


	}
}




