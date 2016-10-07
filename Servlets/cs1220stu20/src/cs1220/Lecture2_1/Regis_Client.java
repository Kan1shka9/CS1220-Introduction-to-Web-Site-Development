package cs1220.Lecture2_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Regis_Client
 */
@WebServlet("/Regis_Client")
public class Regis_Client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Regis_Client() {
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
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>");
		out.println("<title>");
		out.println("CS1220 Lecture 2");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='Regis_Handle' method='post'>");
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
		doGet(request, response);
	}

}