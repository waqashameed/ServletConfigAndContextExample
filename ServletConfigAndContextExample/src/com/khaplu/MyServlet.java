package com.khaplu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		out.print(name);
		out.print(" how is your ");
		String sport = ctx.getInitParameter("sport");
		out.print(sport);
		out.println(" going?");
		
	}

}
