package com.courses.servlets;

import javax.servlet.*;
import java.io.IOException;

public class AuthFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)
            throws IOException, ServletException {

        String login = servletRequest.getParameter("login");
        String password = servletRequest.getParameter("password");

        if (login.equals("john") && password.equals("secret")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            System.out.println("incorrect username and password");
            throw new ServletException("incorrect username and password");
        }
    }

    public void destroy() {

    }
}
