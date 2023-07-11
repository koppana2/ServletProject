package P6;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet
{
	public Servlet() {
		System.out.println(" Servlet objectis created..");
	}
public void init() {
	System.out.println(" init() is called..");
}

public void service(HttpServletRequest request,HttpServletResponse response)
{
	System.out.println(" service () is called..");
}
public void destroy() {
	System.out.println(" destroy() is called..");
}
}
