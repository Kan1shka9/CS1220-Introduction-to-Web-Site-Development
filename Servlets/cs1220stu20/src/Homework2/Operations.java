package Homework2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Operations
 */
@WebServlet("/Operations")
public class Operations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Operations() {
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
		
		int firstnumber = 0;
		int secondnumber = 0;

		String first_number = request.getParameter("fnumber");
		if( ( (first_number == "" || first_number == " " || first_number.matches("\\s+"))) && (first_number.matches("\\d+")) ) {
			out.println("First number cannot be empty.</br>");
        }
        else {
        	out.println("<b>First number: </b>" + first_number + "<br/>");
        }
		
		String second_number = request.getParameter("snumber");
		if( ( (second_number == "" || second_number == " " || second_number.matches("\\s+"))) && (second_number.matches("\\d+")) ) {
			out.println("Second number cannot be empty.</br>");
        }
        else {
        	out.println("<b>Second number: </b>" + second_number + "<br/>");
        }
		
		int k = 0;
		
		try {
			firstnumber = Integer.parseInt(first_number);
			secondnumber = Integer.parseInt(second_number);
			String str = request.getParameter("operator");

			if (str.equals("add")){
				k = firstnumber + secondnumber;
				out.println("<b>Answer after addition : </b>" + k + "<br/>");
			}
			if (str.equals("sub")){
				k = firstnumber - secondnumber;
				out.println("<b>Answer after subtraction : </b>" + k + "<br/>");
			}
			if (str.equals("mul")){
				k = firstnumber * secondnumber;
				out.println("<b>Answer after multiplication : </b>" + k + "<br/>");
			}
			if (str.equals("div")){
				k = firstnumber / secondnumber;
				out.println("<b>Answer after division : </b>" + k + "<br/>");
			}
		} 
		catch (NumberFormatException nfe) {
			out.println("The value entered is not a valid integer.");
		}
		
	}

}