<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: michael
  Date: 28.11.18
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br><br>
        Last name: <form:input path="lastName"/>
        <br><br>

        Country:
        <form:select path="country">
            <%--<form:option value="Russia" label="Rus"/>--%>
            <%--<form:option value="Germany" label="Ger"/>--%>
            <%--<form:option value="India" label="Ind"/>--%>
            <%--<form:option value="USA" label="USA"/>--%>

            <%--<form:options items="${student.countryOptions}"/>--%>

            <form:options items="${theCountryOptions}" />
        </form:select>

        <br><br>

        Favorite programming language:
        <form:radiobutton path="favoriteLanguage" value="Java" label="Java"/>
        <form:radiobutton path="favoriteLanguage" value="Python" label="Python"/>
        <form:radiobutton path="favoriteLanguage" value="C++" label="C++"/>
        <form:radiobutton path="favoriteLanguage" value="Golang" label="Golang"/>

        <br><br>

        Using operating systems:<br>
        <form:checkboxes path="operatingSystems" items="${student.availableOperationSystems}" delimiter="<br>"/>

        <br><br>
        <input type="submit" value="Submit data"/>
    </form:form>

</body>
</html>
