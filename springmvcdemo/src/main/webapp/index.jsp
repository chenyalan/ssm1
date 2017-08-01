<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>

</head>
<body>
<form action="/student/add.do" method="post">
    username:<input type="text" name="username"/><br/>
    sex:<input type="radio" name="sex" value="MALE"/>男生
        <input type="radio" name="sex"value="FEMALE"/>女生<br/>
    age:<input type="text" name="age"/><br/>
    入学年份:<input type="date" name="becomeStudent">
    <!-- POJO支持级联属性，所以name属性是如下的写法，aClass.classId，意思就是有一个aClass的类，类里面有classId属性 -->
    classId:<input type="text" name="aClass.classId"/><br/>
    className:<input type="text" name="aClass.className"/><br/>
    班主任:<input type="text" name="aClass.bzr"/>
    <input type="submit" value="提交" />
</form>

</body>
</html>
