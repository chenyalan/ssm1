<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<form action="/test/addStudent.do" method="post">
    username:<input type="text" name="username"/><br/>
    sex:<input type="radio" name="sex" value="男"/>男生
    <input type="radio" name="sex"value="女"/>女生<br/>
    age:<input type="text" name="age"/><br/>
    <!-- POJO支持级联属性，所以name属性是如下的写法，address.province，意思就是有一个address的类，类里面有province属性 -->
    <%--province:<input type="text" name="address.province"/><br/>--%>
    <%--city:<input type="text" name="address.city"/><br/>--%>
    <input type="submit" value="提交" />
</form>
</body>
</html>
