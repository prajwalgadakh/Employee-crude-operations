package Project1;

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
 * Servlet implementation class ViewRecord
 */
public class ViewRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewRecord() {
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
		response.setContentType("text/html");
		
		Connection con=Emp_Connection.dbConnect();
		PreparedStatement pst;
		try {
			pst = con.prepareStatement("select * from employee_detail ");
			ResultSet rs=pst.executeQuery();		

			PrintWriter pw=response.getWriter();
			pw.print("<html><body><table border='1'><tr><th>EmpId</th><th>Name</th><th>Address</th><th>Gender</th><th>Salary</th><th>Birth-Date</th></tr>");

			while(rs.next())
			{
				
				pw.print("<tr><td>");
				pw.print(rs.getInt(1));
				pw.print("</td>");
				pw.print("<td>");
				pw.print(rs.getString(2));
				pw.print("</td>");
				pw.print("<td>");
				pw.print(rs.getString(3));
				pw.print("</td>");
				pw.print("<td>");
				pw.print(rs.getString(4));
				pw.print("</td>");
				pw.print("<td>");
				pw.print(rs.getString(5));
				pw.print("</td>");
				pw.print("<td>");
				pw.print(rs.getString(6));
				pw.print("</td>");
				pw.print("</tr>");
				
			}
			pw.print("</table></body></html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//pst.setString(1,rpojo.getEmail())

		

	}
	}


