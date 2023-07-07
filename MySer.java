package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.*;

public class MySer extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "prasad", "prasad");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			out.println("<table border=\"2\" align=\"center\">");
			out.println("<tr><th>eno</th><th>ename</th><th>gender</th><th>salary</th></tr>");
			
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>" + rs.getInt("eno") + "</td>");
				out.println("<td>" + rs.getString("ename") + "</td>");
				out.println("<td>" + rs.getString("gender") + "</td>");
				out.println("<td>" + rs.getDouble("salary") + "</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
		}
		catch(ClassNotFoundException | SQLException e)
		{	
			response.sendError(555, e.toString());
		}
		finally
		{
			try
			{
				if(rs != null) {
					rs.close();
				}
				
				if(stmt != null) {
					stmt.close();
				}
				
				if(con != null) {
					con.close();
				}
			}
			catch(SQLException e) { }
		}
		
	}
}
