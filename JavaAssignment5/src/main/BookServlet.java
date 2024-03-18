package main;

import main.Database;

import java.sql.*;
import javax.servlet.http.*;
import java.io.*;

public class BookServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			PrintWriter out = res.getWriter();
			Connection con = new Database().con;
			
			String sql = "SELECT * FROM books WHERE id = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(req.getParameter("bookid")));
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				out.println("<body>");
				out.println("<h1>Book Details:-</h1>");
				out.println("<h2>Book ID: "+ rs.getInt(1)+"</h2>");
				out.println("<h2>Book Name: " + rs.getString(2)+"</h2>");
				out.println("<h2>Author Name: " + rs.getString(3)+"</h2>");
				out.println("<h2>Publication: " + rs.getString(4)+"</h2>");
				out.println("<h2>Date of Publication: " + rs.getString(5)+"</h2>");
				out.println("<h2>Price of Book: " + rs.getInt(6)+"</h2>");
				out.println("</body>");
			}			
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
