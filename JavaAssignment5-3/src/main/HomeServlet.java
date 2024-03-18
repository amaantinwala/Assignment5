package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class HomeServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>Welcome to home page</h1>");
	}
}