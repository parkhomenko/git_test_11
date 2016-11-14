<%@ page import="com.courses.servlets.Student" %>

<html>
    <body>

        <%-- comments --%>

        <%
            Student student = (Student) request.getAttribute("student");
            //out.println(student.getFirstName());
            //out.println(student.getLastName());
            //out.println(student.getAge());
        %>

        <p>
            <%= student.getFirstName() %>
        </p>

        <p>
            <%= student.getLastName() %>
        </p>

        <p>
            <%= student.getAge() %>
        </p>

    </body>
</html>