import java.io.IOException;

import java.io.PrintWriter;



import javax.servlet.GenericServlet;

import javax.servlet.ServletConfig;

import javax.servlet.ServletException;

import javax.servlet.ServletRequest;

import javax.servlet.ServletResponse;

import javax.servlet.annotation.WebInitParam;

import javax.servlet.annotation.WebServlet;



@WebServlet(name="SecondServlet",
        urlPatterns={"/generic"},
        initParams={
                @WebInitParam(name="user",value="xiaobai"),
                @WebInitParam(name="email",value="xiaobai@example.com")
        }
)
public class SecondServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        ServletConfig config=getServletConfig();

        String user=config.getInitParameter("user");

        String email=config.getInitParameter("email");

        response.setContentType("text/html");

        PrintWriter pw=response.getWriter();

        pw.write("User:"+user+"<br>email:"+email);

    }

}