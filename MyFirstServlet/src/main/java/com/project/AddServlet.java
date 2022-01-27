package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
   public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	 
	    int person = Integer.parseInt(req.getParameter("number"));
		int home = Integer.parseInt(req.getParameter("live"));
		int size = Integer.parseInt(req.getParameter("size"));
		int solar = Integer.parseInt(req.getParameter("solar"));
		int food = Integer.parseInt(req.getParameter("food"));
		
		double total_emission = person*0.75+home*0.25+size*0.5+solar*1.25+food*0.25;
	    PrintWriter out = res.getWriter();
	   
	   req.getSession().setAttribute("total_emission",total_emission);
       res.sendRedirect("./Transport.html");   
	   
   }
}
