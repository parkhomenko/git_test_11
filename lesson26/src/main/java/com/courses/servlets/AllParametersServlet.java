package com.courses.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/allparams")
public class AllParametersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        Enumeration<String> params = req.getParameterNames();
        while (params.hasMoreElements()) {
            String param = params.nextElement();
            req.getParameter(param);
        }
        */

        Map<String, String[]> parameterMap = req.getParameterMap();

        Set<String> keys = parameterMap.keySet();

        for (String key : keys) {
            String[] values = parameterMap.get(key);

            for (String value : values) {
                System.out.println(key + " : " + value);
            }
        }
    }
}
