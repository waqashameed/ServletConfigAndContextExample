package com.khaplu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.print("Last name is : ");
		/*
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		out.print(name);
		out.print(" how is your ");
		String sport = ctx.getInitParameter("sport");
		out.print(sport);
		out.println(" going?");
		*/
		ServletConfig cg = getServletConfig();
		String lName = cg.getInitParameter("lastName");
		out.print(lName);
		out.print(" ! ");
		
	}

}
