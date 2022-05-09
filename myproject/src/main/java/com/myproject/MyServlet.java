package com.myproject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyServlet implements Servlet {
	//life cycle method
	ServletConfig conf;
	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("creating object :.....");
		
	}
	
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
		//System.out.println("Serviving.......");
		//set the content type of the response
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>This is my Servlet output..</h1>");
		out.println("<h1>"+new java.util.Date()+"</h1>");
		
		
		
	}
	
	public void destroy() {
		System.out.println("going to destroy...");
	}
	
	//non life cycle method
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "this servlet is created by Ayush Rastogi";
	}
}

