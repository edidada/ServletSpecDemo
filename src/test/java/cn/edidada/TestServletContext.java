package cn.edidada;

import junit.framework.Assert;
import org.junit.Test;

import javax.servlet.*;

public class TestServletContext {

    @Test
    public void setServletContext(){
        Servlet mServlet;
        ServletConfig mServletConfig;
        ServletRequest mServletRequest;
        ServletResponse mServletResponse;
        ServletContext mServletContext;
        GenericServlet mGenericServlet;
        RequestDispatcher mRequestDispatcher;
        Filter mFilter;
        Assert.assertEquals(1,1);
    }
}
