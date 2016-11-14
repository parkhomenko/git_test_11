package com.courses.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/students")
public class StudentsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsps/students.jsp");

        List<Student> students = new ArrayList<Student>();

        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Wayne");
        student.setAge(35);

        students.add(student);

        student = new Student();
        student.setFirstName("Mark");
        student.setLastName("Arthur");
        student.setAge(25);

        students.add(student);

        student = new Student();
        student.setFirstName("James");
        student.setLastName("Brown");
        student.setAge(37);

        students.add(student);

        req.setAttribute("student", student);
        req.setAttribute("students", students);

        dispatcher.forward(req, resp);
    }
}
