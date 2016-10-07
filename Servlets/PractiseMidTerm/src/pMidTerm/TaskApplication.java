package pMidTerm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaskApplication
 */
@WebServlet("/TaskApplication")
public class TaskApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskApplication() {
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
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<title>Application Manager</title>");
        out.println("<meta charset='utf-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
        out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js'></script>");
        out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Enter details</h2>");
        out.println("<form action='TaskApplication' method='post'>");
        out.println("<div class='form-group'>");
        out.println("<label for='fname'>First Name :- </label>");
        out.println("<input type='text' class='form-control' id='fname' name='fname' placeholder='Enter first name'>");
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println("<label for='lname'>Last name :- </label>");
        out.println("<input type='text' class='form-control' id='lname' name='lname' placeholder='Enter last name'>");
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println("<label for='task_title'>Task Title :- </label>");
        out.println("<input type='text' class='form-control' id='task_title' name='task_title' placeholder='Enter task title'>");
        out.println("</div>");
        out.println("<button type='submit' class='btn btn-default'>Submit</button>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");	
        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Will print on the same page if doGet is not commented
		// doGet(request, response);
		
		PrintWriter out = response.getWriter();
		
		ArrayList<taskDescriptor> people = new ArrayList<taskDescriptor>();
		people.add(new taskDescriptor("Jane", "Doe", "Task1"));
		people.add(new taskDescriptor("John", "Doe", "Task2"));
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Registration Page</title>");	

		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<table class='table'>");
		out.println("<tr>");
		out.println("<th><b>First Name</b></th>");
		out.println("<th><b>Last Name</b></th>");
		out.println("<th><b>Task Title</b></th>");
		out.println("<th><b>Date</b></th>");	
		out.println("</tr>");
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String taskTitle = request.getParameter("task_title");
		boolean flag=true;
		
		if( (firstName.equals("") || firstName.equals(" ") || firstName.matches("\\s+")) || !(firstName.matches("^[A-Za-z]+")) ) {
			out.println("First name cannot be empty and should not contain numbers.</br>");
			flag=false;
        }
		
		if( (lastName.equals("") || lastName.equals(" ") || lastName.matches("\\s+")) || !(lastName.matches("^[A-Za-z]+")) ) {
			out.println("Last name cannot be empty and should not contain numbers.</br>");
			flag=false;
        }
		
		if( (taskTitle.equals("") || taskTitle.equals(" ") || taskTitle.matches("\\s+")) || !(taskTitle.matches("[a-zA-Z0-9]+")) ) {
			out.println("Task Title cannot be empty.</br>"); 
			flag=false;
        }
		
		if(flag)
			people.add(new taskDescriptor(firstName, lastName, taskTitle));
		
		for(taskDescriptor s: people){
			out.println("<tr>");
			out.println("<td>"+ s.getFname()+"</td>");
			out.println("<td>"+ s.getLname()+"</td>");
			out.println("<td>"+ s.getTaskTitle()+"</td>");
			out.println("<td>"+ new Date() +"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}