package cn.edidada;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.util.Enumeration;

public class MyServletConfig implements ServletConfig {
    public String getServletName() {
        return null;
    }

    public ServletContext getServletContext() {
        return null;
    }

    public String getInitParameter(String name) {
        return null;
    }

    public Enumeration<String> getInitParameterNames() {
        return null;
    }
}
