package com.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
	    //String name="";
		/*Cookie[] thecookie=req.getCookies();
		if(thecookie!=null) {
			for(Cookie e:thecookie) {
				if("MyName".equals(e.getName())) {
					name=e.getValue();
					break;
				}
			}
		}*/
		String name=req.getParameter("name");
		PrintWriter out=resp.getWriter();
		out.println("<h1>Hello ,"+name+" Welcome back </h1>");
	}

}