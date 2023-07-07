package p4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContext extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		
		javax.servlet.ServletContext application=this.getServletContext();
		
		String s1 = application.getInitParameter("N");
		String s2 = application.getInitParameter("P");
		
		out.println(s1 + " --- " + s2);
	}
}
