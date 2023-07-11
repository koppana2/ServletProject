package P5;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;

public class LoginWeb extends HttpServlet{

	public  void service (HttpServletRequest request, HttpServletResponse response)throws IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		 

		out.println(userName +" ----"+password + "<br/>");
		out.println("<a href=\"/Login/login.html\">back</a>");
	}

}
