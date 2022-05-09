package com.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		
		//add
		int sum=n1+n2;
		
		//attribute set
		req.setAttribute("sum",sum); 
		
		//request...forward using requestDispatcher
		RequestDispatcher rd=req.getRequestDispatcher("servlet2");
		rd.forward(req, res);
		
	}
	
}
