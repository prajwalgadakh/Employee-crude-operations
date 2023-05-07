package Project1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.io.*;

/**
 * Servlet implementation class Emp_Servlet
 */
public class Emp_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Emp_Servlet() {
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
		PrintWriter pw=response.getWriter();
		int EmployeeId=Integer.parseInt(request.getParameter("EmployeeId"));
		String Name=request.getParameter("Name");
		String Address=request.getParameter("Address");
		String Gender=request.getParameter("Gender");
		String Salary=request.getParameter("Salary");
		String BirthDate=request.getParameter("BirthDate");
		
	  Emp_pojo epojo=new Emp_pojo( EmployeeId, Name, Address, Gender,  Salary, BirthDate);
	  Emp_Dao edao=new Emp_Dao();
	  try {
		  String str=edao.Adduser(epojo);
		  pw.print(str);
	  }
	  catch(SQLException | ClassNotFoundException e)
	  {
		 e.printStackTrace(); 
	  }
	  

	}

	}


