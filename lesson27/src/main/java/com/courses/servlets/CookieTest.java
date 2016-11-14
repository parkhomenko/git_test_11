package com.courses.servlets;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/setusername")
public class CookieTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");

        Cookie cookie = new Cookie("username", username);
        resp.addCookie(cookie);

        User user = new User();
        user.setName("John");
        user.setAge(50);

        HttpSession session = req.getSession();
        session.setAttribute("user", user);
    }
}
