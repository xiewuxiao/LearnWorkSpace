package com.ben.hello.setup;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by hasee on 2017/12/4.
 */
public class SystemEnviromentSvlt extends HttpServlet {
    //系统初始化变量设置
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.setProperty("file.encoding","UTF-8");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
