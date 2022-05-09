
package com.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class registerServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		//out.println("<h2>Welcome to register Servlet...</h2>");
		String fname=req.getParameter("firstname");
		String lname=req.getParameter("lastname");
		String uname=req.getParameter("Username");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String zip=req.getParameter("zip");
		String cond=req.getParameter("check");
		if(cond!=null) {
			out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
			out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n"
					+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n"
					+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
			out.println("<div class=\"card\" style=\"width: 18rem;\">");
				out.println("<ul class=\"list-group list-group-flush\">");
					out.println("<li class=\"list-group-item\">"+fname+"</li>");
					out.println("<li class=\"list-group-item\">"+lname+"</li>");
					out.println("<li class=\"list-group-item\">"+uname+"</li>");
					out.println("<li class=\"list-group-item\">"+city+"</li>");
			 		out.println("<li class=\"list-group-item\">"+state+"</li>");
					out.println("<li class=\"list-group-item\">"+zip+"</li>");
				out.println("</ul>");
			out.println("</div>");
			
			//jdbc 
			//
			
			//saved to db 
			 
			RequestDispatcher rd=req.getRequestDispatcher("success");
			rd.forward(req, res);
			
			
		}else {
			out.println("<h2> You Have Not Accepted terms and Conditions..</h2>");
			// i want to include output of index.html
			
			//get the object of RequestDispatcher
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
			
		}
	}
}
