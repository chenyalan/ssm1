<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/28
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示</title>
</head>
<body>
   <table>
       <th><td>序号</td><td>姓名</td><td>性别</td><td>年龄</td></th>
       <%--<c:forEach items="${user}" var="item">--%>
           <%--<td>${item.id}</td>--%>
           <%--<td>${item.name}</td>--%>
           <%--<td>${item.sex}</td>--%>
           <%--<td>${item.age}</td>--%>
       <%--</c:forEach>--%>
       您的id:<c:out value="${user.id}"></c:out>
       您的名字:<c:out value="${user.name}"></c:out><br>
       您的性别:<c:out value="${user.sex}"></c:out>
   </table>
</body>
</html>
