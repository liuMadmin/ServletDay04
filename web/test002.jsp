<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/6/5
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>radio and date</title>
</head>
<body>

    <%
        request.setAttribute("sex",2);
    %>

    <form action="#" method="get">
        性别：<input type="radio"  value="1" name="sex" <c:if test="${sex==1}">checked</c:if> >男
              <input type="radio"  value="2" name="sex" <c:if test="${sex==2}">checked</c:if> >女
        <br>
        <input type="submit" value="提交">
    </form>

    <%
        Date date = new Date();
        request.setAttribute("date",date);
    %>
    日期：<input value='<fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>'><br>
    日期：<input value="<fmt:formatDate value='${date}' pattern='yyyy-MM-dd HH:mm:ss'></fmt:formatDate>">

</body>
</html>
