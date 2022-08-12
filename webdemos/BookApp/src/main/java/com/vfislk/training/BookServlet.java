package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
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
		String title=request.getParameter("title");
		//String bookId=request.getParameter("bookId");
		int id=Integer.parseInt(request.getParameter("bookId"));
		String author=request.getParameter("author");
		String category=request.getParameter("category");
		String price=request.getParameter("price");
		double mprice=Double.parseDouble(price);
		
		//set the attribute to send to the next jsp
		request.setAttribute("mytitle",title);
		request.setAttribute("author",author);
		request.setAttribute("category",category);
		request.setAttribute("bookId",id);
		request.setAttribute("price",mprice);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
