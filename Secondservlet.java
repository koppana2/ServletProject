import javax.servlet.http.*;
import java.io.*;
public class Secondservlet extends HttpServlet
{
public void service(HttpServletRequest request, HttpServletResponse response) throws IOException 
{
PrintWriter out = response.getWriter();
out.println("welcome to servlets");
}
}