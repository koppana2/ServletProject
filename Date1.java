import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class Date1 extends HttpServlet
{

   public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
{
	PrintWriter out = response.getWriter();
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMMM-YYYY  HH-MM-SS a");
	String str = sdf.format(d);
	out.println(str);
}
}