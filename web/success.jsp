<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/5/27
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h1 style="text-align: center;color: green">登陆成功</h1>
    <br>
        <table align="center" border="1" cellpadding="0" cellspacing="0" width="50%">
            <tr align="center">
                <td>id</td>
                <td>name</td>
                <td>pwd</td>
                <td>sex</td>
                <td>birthday</td>
                <td>address</td>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr align="center">
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.password}</td>
                    <td>${user.sex}</td>
                    <td>${user.birthday}</td>
                    <td>${user.address}</td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>