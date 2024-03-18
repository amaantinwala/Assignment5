package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		String uname=req.getParameter("username");
		Cookie c = new Cookie("username",uname);
		res.addCookie(c);
		
		PrintWriter out = res.getWriter();
		out.print("<h1>Login successful !!</h1>");
		out.print("<a href='assign5.html'>Select page</a>");
		
	}
}
