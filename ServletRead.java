package p3;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRead extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		
		ServletConfig config = this.getServletConfig();
		
		String s1 = config.getInitParameter("name");
		String s2 = config.getInitParameter("pwd");
		
		out.println(s1 + " --- " + s2);
	}
}
