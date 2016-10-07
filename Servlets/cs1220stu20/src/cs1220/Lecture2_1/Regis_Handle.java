package cs1220.Lecture2_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Regis_Handle
 */
@WebServlet("/Regis_Handle")
public class Regis_Handle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Regis_Handle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		PrintWriter out = response.getWriter();	
		
		String firstname = request.getParameter("fname");
		// For the browser omit the + "<br/>" in the out.println
		// out.println("First name :- " + firstname );
		out.println("First name :- " + firstname  + "<br/>");
		String lastname = request.getParameter("lname");
		out.println("Last name :- " + lastname  + "<br/>");
		String my_age = request.getParameter("age");
		out.println("Age :- " + my_age  + "<br/>");
		String my_address = request.getParameter("address");
		out.println("Address :- " + my_address + "<br/>");
		String my_zip = request.getParameter("zip");
		out.println("Zip :- " + my_zip + "<br/>");
	}

}
