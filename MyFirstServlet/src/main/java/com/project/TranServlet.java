package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TranServlet extends HttpServlet{
   public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	 
	    int vehicle = Integer.parseInt(req.getParameter("vehicle"));
		int km = Integer.parseInt(req.getParameter("km"));
		int consume = Integer.parseInt(req.getParameter("consume"));
		int milage = Integer.parseInt(req.getParameter("kms"));
		int mpg = Integer.parseInt(req.getParameter("mpg"));
		
		double total_emission2 = vehicle*0.25+km*1.5+consume*0.75+milage*0.5+mpg*0.75;
	    PrintWriter out = res.getWriter();
	    
	    req.getSession().setAttribute("total_emission2",total_emission2);
		res.sendRedirect("./Result.jsp");   
	   
   }
}