<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/11
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<form action="/test/addStudent.do" method="post">
    <lable>姓名:</lable> <input type="text" name="username"/> <br>
    <lable>性别:</lable> <input type="radio" name="sex" value="男">男<<input type="radio" name="sex" value="女">女<br>
    <label>年龄:</label> <input type="text" name="age"><br>
    <label>班级id:</label> <input type="text" name="aClass.classId"><br>
    <label>班级名:</label> <input type="text" name="aClass.className"><br>
    <label>班主任:</label> <input type="text" name="aClass.bzr"><br>
    <input type="submit">提交
</form>

</body>
</html>
