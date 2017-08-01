<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<form action="/fileupload/do3.do" method="post"enctype="multipart/form-data">
    选择文件:<input type="file" name="file"/><br/>
    <input type="submit" value="提交" />
</form>
</body>
</html>
