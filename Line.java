import javax.servlet.http.*;
import java.io.*;
public class Line extends HttpServlet
{
public void service(HttpServletRequest request, HttpServletResponse response) throws IOException 
{
PrintWriter out = response.getWriter();
response.setContentType("text/html");
out.println(" Line1");
out.println(" Line2");
out.println(" Line3");
out.println(" Line4");
}
}