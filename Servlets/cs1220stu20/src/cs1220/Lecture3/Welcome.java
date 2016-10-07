package cs1220.Lecture3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter out = response.getWriter();
		
		// Check for nulls and empty
		String firstname = request.getParameter("fname");
		if( firstname == "" || firstname == " " || firstname.matches("\\s+") ) {
			out.println("First name cannot be empty.</br>");
        }
        else {
        	out.println("<b>First Name: </b>" + firstname+"<br/>");
        }
		
		String lastname = request.getParameter("lname");
		if( lastname == "" || lastname == " " || lastname.matches("\\s+") ) {
			out.println("Last name cannot be empty.</br>");
        }
        else {
        	out.println("<b>Last Name: </b>" + lastname+"<br/>");
        }
		
		String email = request.getParameter("email");
		if( email == "" || email == " " || email.matches("\\s+")) {
			out.println("Email cannot be empty.</br>");
        }
        else {
        	out.println("<b>Email: </b>" + email+"<br/>");
        }
		
		String pwd = request.getParameter("pwd");
		if( pwd == "" || pwd == " " || pwd.matches("\\s+") ) {
			out.println("Password cannot be empty.</br>");
        }
        else {
        	out.println("<b>Password: </b>" + pwd+"<br/>");
        }
		
		String address = request.getParameter("address");
		if( address == "" || address == " " || address.matches("\\s+") ) {
			out.println("Address cannot be empty.</br>");
        }
        else {
        	out.println("<b>Address: </b>" + address+"<br/>");
        }

		//System.out.println(firstname);
		//PrintWriter out = response.getWriter();
		//out.println("<b>First Name: </b>" + firstname+"<br/>");
		//out.println("<b>Last Name: </b>" +lastname+"<br/>");
		//out.println("<b>Email: </b>" +email+"<br/>");
		//out.println("<b>Password: </b>" +pwd+"<br/>");
		//out.println("<b>Address: </b>" +address+"<br/>");
	}

}
