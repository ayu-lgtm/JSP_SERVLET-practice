package com.httpservlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("this is get method");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<h1>this is get method of my servlet</h1>");
		
	}
}
