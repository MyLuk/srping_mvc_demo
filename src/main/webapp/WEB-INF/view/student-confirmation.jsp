<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michael
  Date: 28.11.18
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
The student was confirmed: ${student.firstName} ${student.lastName}
<br><br>
Country: ${student.country}
<br><br>
Favorite language: ${student.favoriteLanguage}

<br><br>
Using OS:

<ul>
    <c:forEach var="os" items="${student.operatingSystems}">
        <li> ${os} </li>
    </c:forEach>
</ul>
</body>
</html>
