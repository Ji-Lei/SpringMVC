<%@ page import="java.util.List" %>
<%@ page import="com.jgs1902.pojo.InfoList" %>
<%@ page import="com.jgs1902.pojo.Info" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/12/27
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <form action="insertInfo">
        添加资讯--->
        标题：<input type="text" name="title">
        内容：<input type="text" name="content">
        <input type="submit" value="添加">
    </form>

    <table border="1" cellpadding="0" align="center">
        <tr>
            <th>ID</th>
            <th>标题</th>
            <th>回复/查看</th>
            <th>发表时间</th>
            <th>最新回复时间</th>
        </tr>
        <c:forEach items="${lists}" var="info">
        <tr>
            <td>${info.id}</td>
            <td><a href="showOne?id=${info.id}">${info.title}</a></td>
            <td>${info.replyCount}/${info.viewCount}</td>
            <td>${info.reportTime}</td>
            <td>${info.lastPostTime}</td>
        <tr/>
        </c:forEach>
    </table>
</div>

</body>
</html>