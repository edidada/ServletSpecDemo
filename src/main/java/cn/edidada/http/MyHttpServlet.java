package cn.edidada.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathName = req.getServletPath();
        System.out.println("pathName:" + pathName);

        int index = pathName.indexOf(".");
        String actionName = pathName.substring(1,index);
        System.out.println("actionName:" + actionName);

        String actionClass = getInitParameter(actionName);
        System.out.println("actionClass:" + actionClass);

    }
}
