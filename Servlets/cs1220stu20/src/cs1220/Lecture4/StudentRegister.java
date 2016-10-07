package cs1220.Lecture4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegister
 */
@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegister() {
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
				out.println("<title>Registration Page</title>");	
				out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");

				out.println("</head>");

				out.println("<body>");
				out.println("<form action='StudentRegister' method='post'>");
				out.println("First Name : <input type='text' id='fname' name='fname'><br/>");
				out.println("Last Name : <input type='text' id='lname' name='lname'><br/>");
				out.println("Grades : <input type='text' id='grade' name='grade'><br/>");
				
				
				out.println("<input type='submit' value='Add'><br/>");
				out.println("</form>");	
				out.println("</body>");
				
				out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		PrintWriter out = response.getWriter();
		
		ArrayList<StudentsRecord> students = new ArrayList<StudentsRecord>();
		students.add(new StudentsRecord("Jane", "Admin", "70"));
		students.add(new StudentsRecord("Doe", "Admin", "74"));
		students.add(new StudentsRecord("Jane Doe", "Admin", "75"));
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Registration Page</title>");	

		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
		out.println("</head>");

		out.println("<body>");
		out.println("<table class='table'>");
		out.println("<tr>");
		out.println("<td>First Name</td>");
		out.println("<td>Last Name</td>");
		out.println("<td>Grades</td>");		
		out.println("</tr>");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String grade = request.getParameter("grade");
		
		students.add(new StudentsRecord(fname, lname, grade));
		
		for(StudentsRecord s: students){
			out.println("<tr>");
			out.println("<td>"+ s.getFname()+"</td>");
			out.println("<td>"+ s.getLname()+"</td>");
			out.println("<td>"+ s.getGrade()+"</td>");
			out.println("</tr>");	
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}