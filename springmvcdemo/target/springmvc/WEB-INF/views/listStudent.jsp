<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/11
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <table>
      <thead>
      <th>姓名</th>
      <th>性别</th>
      <th>年龄</th>
      <th>入学时间</th>
      <th>班级id</th>
      <th>班级</th>
      <th>班主任</th>
      </thead>
      <tr><td>${student.username}</td>
          <td>${student.sex}</td>
          <td>${student.age}</td>
          <td>${student.becomeStudent}</td>
          <td>${student.aClass.classId}</td>
          <td>${student.aClass.className}</td>
          <td>${student.aClass.bzr}</td>
      </tr>
      <tr><td>${stu.username}</td>
          <td>${stu.sex}</td>
          <td>${stu.age}</td>
          <td>${stu.becomeStudent}</td>
          <td>${stu.aClass.classId}</td>
          <td>${stu.aClass.className}</td>
          <td>${stu.aClass.bzr}</td>
      </tr>
  </table>
我来试试session:${sessionScope.student.username}<br>
选择语言：
  选择语言：<a href="/student/add.do?language=zh_CN">中文</a> | <a href="?language=en_US">英文</a> |
   <br></br>
  这里展示选择对应语言后的“登陆”的翻译（前台标签翻译）：
   <spring:message code="loginName" />
  <br></br>
  这里展示选择对应语言后的“欢迎你”的翻译（后台代码翻译）：${welcome}

</body>
</html>
