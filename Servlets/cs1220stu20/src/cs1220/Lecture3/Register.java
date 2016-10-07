package cs1220.Lecture3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter(); 
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("CS1220Lecture3");
		out.println("</title>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='page-header'>");
		out.println("<h1>Register <small>CS1220 First Dynamic Project</small></h1></div>");
		out.println("<form action='Welcome' method='post'>");
		
		out.println("<label>First Name</label><br/>");
		out.println("<input type='text' id='fname' name='fname'><br/>");
		
		out.println("<label>Last Name</label><br/>");
		out.println("<input type='text' id='lname' name='lname'><br/>");

		out.println("<label>Email</label><br/>");
		out.println("<input type='email' id='email' name='email'><br/>");
		
		out.println("<label>Password</label><br/>");
		out.println("<input type='password' id='pwd' name='pwd'><br/>");
		
		out.println("<label>Address</label><br/>");
		out.println("<input type='text area' id='address' name='address'><br/>");
		
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}