package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddJava extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int num1=Integer.parseInt(req.getParameter("n1"));
		int num2=Integer.parseInt(req.getParameter("n2"));
		int k=num1+num2;
		PrintWriter out=res.getWriter();
   	    out.println("Result : "+k);
		
		
	}

}
