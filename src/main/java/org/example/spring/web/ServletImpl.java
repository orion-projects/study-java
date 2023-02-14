package org.example.spring.web;

import jakarta.servlet.*;
import jakarta.servlet.annotation.MultipartConfig;

import java.io.IOException;

@MultipartConfig(maxFileSize = 1024*1024*10, maxRequestSize = 1024*1024*12)
public class ServletImpl implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        //var config = ServletConfig.
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
