<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: bart
  Date: 17.02.19
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>

    </style>
</head>
<body>

<h1>Gaming Service</h1>
<form:errors path="login"/>
<form:errors path="password"/>
<table>
    <form:form id="login_form" method="POST" modelAttribute="userAuthDto">

        <tr>
            <td>
                Login:
            </td>
            <td>
                <form:input path="login"/>
            </td>
        </tr>
        <tr>
            <td>
                Password:
            </td>
            <td>
                <form:password path="password"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Sign in"></td>
        </tr>

    </form:form>
</table>

Create a new free account:
<button onclick=window.location.href="registration_form">Join now</button>

</body>
</html>
