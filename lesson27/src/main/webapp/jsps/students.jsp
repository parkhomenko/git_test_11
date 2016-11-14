<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <body>
        <c:forEach items="${students}" var="stud">
            <p>
                <c:out value="${stud.firstName}" />
                <c:out value="${stud.lastName}" />
                <c:out value="${stud.age}" />
            </p>
        </c:forEach>

        <!--
            <p>
                <c:out value="${student.firstName}" />
            </p>
            <p>
                <c:out value="${student.lastName}" />
            </p>
            <p>
                <c:out value="${student.age}" />
            </p>
        -->
    </body>
</html>