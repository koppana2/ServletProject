import javax.servlet.*;

public class FirstServlet implements Servlet
{
private ServletConfig config;

public FirstServlet(){
System.out.println(" FirstServlet object is created....");
}

public void init(ServletConfig config){
this.config = config;
System.out.println(" init ()  method  is created....");
}

public void service(ServletRequest request, ServletResponse response){
System.out.println(" Servlet() method  is created....");
}

public void destroy()
{
config=null;
System.out.println(" Destroy() method  is created....");
}

public ServletConfig getServletConfig(){
System.out.println(" ServletConfig() method  is created....");
return config;
}

public String getServletInfo(){
System.out.println(" getServletInfo() method is created....");
return " prasad Servlet ";
}
}