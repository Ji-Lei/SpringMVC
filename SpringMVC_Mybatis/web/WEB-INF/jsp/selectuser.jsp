<%@ page import="com.jgs1902.pojo.UsersList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.jgs1902.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/12/26
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
共查出： ${count} 条记录<br>
<%
    List<UsersList> lists=(List) request.getAttribute("list");
    for (UsersList usersList:lists){
        for (User user:usersList.getList()){
            out.print(user.getUsername()+"<br>");
        }
    }
%>
<h3>查询</h3>
<form action="select" method="post">
    根据用户名查询（默认查询所有）：<input type="text" name="username">
    <input type="submit" value="查询"><br>
</form>
<h3>添加</h3>
<form action="adduser" method="get">
    账号：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="添加"><br>
</form>
<h3>删除</h3>
<form action="deleteuser" method="post">
    输入要删除的用户：<input type="text" name="username">
    <input type="submit" value="删除"><br>
</form>
</body>
</html>
