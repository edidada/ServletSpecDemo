import javax.servlet.*;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


//name可选，提供servlet名，关键urlPatterns指定匹配当前servlet的模式

@WebServlet(name="/FirstServlet",urlPatterns={ "/myapp" })
public class FirstServlet implements Servlet {

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {

        //将config给类变量，扩大使用范围

        this.config=config;

    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletInfo() {
        return "My Servlet";
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        String servletName=config.getServletName();

        response.setContentType("text/html");

        PrintWriter pw=response.getWriter();

        pw.write("hello from "+servletName);

    }

    @Override
    public void destroy() {

    }

}