package Homework2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Calculator");
		out.println("</title>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='page-header'>");
		out.println("<h1><small>Simple Calculator - Homework 2</small></h1></div>");
		out.println("<form action='Operations' method='post'>");
		
		out.println("<label>First Number</label><br/>");
		out.println("<input type='text' id='fnumber' name='fnumber'><br/>");
		
		out.println("<label>Second Number</label><br/>");
		out.println("<input type='text' id='snumber' name='snumber'><br/>");
		
		out.println("<hr>");
		
		out.println("<select name = 'operator'>");
			out.println("<option value='add'>Addition</option>");
			out.println("<option value='sub'>Subtraction</option>");
			out.println("<option value='mul'>Multiplication</option>");
			out.println("<option value='div'>Division</option>");
		out.println("</select>");
		
		out.println("<hr>");
		
		out.println("<input type='submit' value='Submit'>");
		
		out.println("</form>");
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
