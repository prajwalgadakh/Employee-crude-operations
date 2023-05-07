package Project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Emp_Dao
{
	
	public String Adduser(Emp_pojo epojo) throws SQLException, ClassNotFoundException
	{
		Connection con=Emp_Connection.dbConnect();
		
		 //con=null;
		String sql="insert into employee_detail values(?,?,?,?,?,?);";
		
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,epojo.getEmployeeId());
		pst.setString(2,epojo.getName());
		pst.setString(3,epojo.getAddress());
		pst.setString(4,epojo.getGender());
		pst.setString(5,epojo.getSalary());
		pst.setString(6,epojo.getBirthDate());
		
		int i=pst.executeUpdate();
		
		if(i>0)
		{
			return "Success";
		}
		else
			return "Error";
		
	}

}
