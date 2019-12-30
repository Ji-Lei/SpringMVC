<%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/12/25
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--作业--%>
    <h3>${result}</h3>
    <form action="student2" method="post">
        <input type="text" name="sname" placeholder="姓名"><br>
        <input type="text" name="sex" placeholder="性别"><br>
        <input type="text" name="cno" placeholder="学号"><br>
        <input type="submit" id="submit" value="提交"><br>
    </form>
</body>
</html>
