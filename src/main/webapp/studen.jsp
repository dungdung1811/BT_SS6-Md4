<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/7/2023
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Student List</h1>
<table>
    <thead>
    <tr>
        <th>Student Id</th>
        <th>Full name</th>
        <th>Age</th>
        <th>Sex</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.fullName}</td>
            <td>${student.age}</td>
            <td>${student.sex ? "Nam" : "Nữ"}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
