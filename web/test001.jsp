<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/6/5
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>jstl if and jstl multiple selection </title>
</head>
<body>
    <c:set var="age1" value="17"></c:set>
    <c:if test="${age1>18}" var="sbq1"> 爱干嘛干嘛 </c:if>
    <c:if test="${!sbq1}"> 好好学习</c:if>
    <br>

    <c:set var="age2" value="24"></c:set>
    <c:choose>
        <c:when test="${age2>=1 && age2<24}">好好工作</c:when>
        <c:when test="${age2<50}">中老年</c:when>
        <c:otherwise>自己想办法</c:otherwise>
    </c:choose>

</body>
</html>
