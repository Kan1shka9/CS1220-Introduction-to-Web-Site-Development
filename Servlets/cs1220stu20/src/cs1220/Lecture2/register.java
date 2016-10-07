package cs1220.Lecture2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("CS1220 Lecture 2");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='register' method='post'>");
		out.println("<h1>Register</h1>");
		
		out.println("<label>First Name :- </label><br/>");
		out.println("<input type='text' id='fname' name='fname'><br/>");
		
		out.println("<label>Last Name :- </label><br/>");
		out.println("<input type='text' id='lname' name='lname'><br/>");
		
		out.println("<label>Age :- </label><br/>");
		out.println("<input type='text' id='age' name='age'><br/>");
		
		out.println("<label>Address :- </label><br/>");
		out.println("<textarea rows='4' cols='50' id='address' name='address'>");
		out.println("</textarea><br/>");
		
		out.println("<label>Zip :- </label><br/>");
		out.println("<input type='text' id='zip' name='zip'><br/>");
		
		out.println("<input type='submit' value='submit'>");
		out.println("<form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();	
		
		String firstname = request.getParameter("fname");
		out.println(firstname);
		String lastname = request.getParameter("lname");
		out.println(lastname);
		String my_age = request.getParameter("age");
		out.println(my_age);
		String my_address = request.getParameter("address");
		out.println(my_address);
		String my_zip = request.getParameter("zip");
		out.println(my_zip);
	}

}
