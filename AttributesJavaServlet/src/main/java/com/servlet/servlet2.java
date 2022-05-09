package com.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int n1=Integer.parseInt(req.getParameter("n1"));
	int n2=Integer.parseInt(req.getParameter("n2"));
	int p=n1*n2;
	
	res.setContentType("text/html");
	//get attribute from servlet1
	
	int sum=(int) req.getAttribute("sum");
	PrintWriter out=res.getWriter();
	out.println("<h1>");
	out.println("Sum is = "+sum);
	out.println("<hr>");
	out.println("Product is = "+p);
	out.println("</h1>");
	}
}
