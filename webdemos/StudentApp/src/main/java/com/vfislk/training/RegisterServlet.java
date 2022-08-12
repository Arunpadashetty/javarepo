package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerservlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//get the writer of the object
		PrintWriter out=response.getWriter();
		
		//get the data from the jsp page
		String username=request.getParameter("username");
		//String studentId=request.getParameter("studentId");
		int id=Integer.parseInt(request.getParameter("studentId"));
		String city=request.getParameter("city");
		
		String language=request.getParameter("language");
		String hobbies[]=request.getParameterValues("hobbies");
		

		out.print("<html><boody>");
		out.print("<Strong>Welcome  : "+username+"<br>");
		out.print("<Strong>Your studentId is   :"+id+"<br>");
		out.print("<Strong>Your city is   :"+city+"<br>");
		out.print("<Strong>Your Language is   :"+language+"<br>");
		Stream.of(hobbies).forEach(out::print);	
		out.print("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
