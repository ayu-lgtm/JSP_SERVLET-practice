package com.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		PrintWriter out=resp.getWriter();
		out.println("<h1>Hello ,"+name+"</h1>");
		out.println("<h1><a href='servlet2'>Got to Servlet 2 </a></h1>");
		
		/*Cookie thecookie=new Cookie("MyName",name);
		thecookie.setMaxAge(24*365*60*60);
		resp.addCookie(thecookie);*/
	}

}
