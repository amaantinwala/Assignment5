package customFilters;


import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Filter1 implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		
		HttpSession session = request.getSession();
		Enumeration<String> name= session.getAttributeNames();
		boolean b= false;
		while(name.hasMoreElements()) {
			if(name.nextElement() == "username") {
				b=true;
				break;
			}
		}
		if(b) chain.doFilter(req, res);
		else {
			PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			out.print("<h1>Login to continue</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
	}
	
}
