package main;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class SelectServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String choice = req.getParameter("select");
		
		HttpSession session = req.getSession();
		session.setAttribute("language",choice);
		
		res.sendRedirect("display");
	}
}
