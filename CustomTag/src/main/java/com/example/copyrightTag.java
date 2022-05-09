package com.example;

//import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
//import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class copyrightTag extends TagSupport {

	private static final int SKIP_BODY = 0;

	public int number;
	public String color;
	
	public void setNumber(int n) {
		number=n;
		
	}
	public void setColor(String c) {
		color=c;
		
	}
	public int doStartTag() throws JspException {
		
		JspWriter out=pageContext.getOut();
		try {
			out.println("<div style='color:"+color+"'>");
			for(int i=0;i<number;i++) {
				out.print("<h3>"+i+"</h3>");	
			}
			out.println("</div>");
		}catch(java.io.IOException e) {
			e.getStackTrace();
		}
		return SKIP_BODY;
	}
	
}
