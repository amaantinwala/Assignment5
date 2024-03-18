package main;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		HttpSession session = req.getSession();
		Object language = session.getAttribute("language");
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.print("<h1>Your Language : "+language+"</h1>");
	}
}
