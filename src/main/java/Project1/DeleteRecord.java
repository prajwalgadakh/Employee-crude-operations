package Project1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class DeleteRecord
 */
public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
		
		
             PrintWriter pw=response.getWriter();
             int EmployeeId=Integer.parseInt(request.getParameter("id"));
	   	try {
			
			Connection con=Emp_Connection.dbConnect();
			String sql="delete from employee_detail where EmployeeId=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			Emp_pojo epojo=new Emp_pojo();
			stmt.setInt(1,EmployeeId);
			int i=stmt.executeUpdate();
			if(i>0)
			{
				//RequestDispatcher rd =request.getRequestDispatcher("delete");
				pw.print("delete");
			}
			else
			{
				pw.print("not delete");
			}
           
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}


