<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/6/1
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
    <title>successPhone</title>
</head>
<body>
<h1 style="text-align: center;color: green">查找成功</h1>
<br>
<table align="center" border="1" cellpadding="0" cellspacing="0" width="50%">
    <tr align="center">
        <td>id</td>
        <td>name</td>
        <td>color</td>
        <td>money</td>
    </tr>
    <c:forEach items="${Phones}" var="phone">
        <tr align="center">
            <td>${phone.id}</td>
            <td>${phone.pName}</td>
            <td>${phone.color}</td>
            <td>${phone.money}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
