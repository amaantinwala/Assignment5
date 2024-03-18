package main;

import java.io.*;
import javax.servlet.http.*;
import java.time.*;

public class CurrentTime extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		LocalTime currenttime = LocalTime.now();
		out.println("Cuurent Time: "+ currenttime);
	}
}