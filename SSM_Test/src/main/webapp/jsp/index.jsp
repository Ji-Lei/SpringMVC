<%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/12/30
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <script>
        var ctrl="${ctrl}";
        if(ctrl != ""){
            alert(ctrl)
        }
    </script>
</head>
<body>
<div style="text-align: center;">
    <table border="1" cellpadding="0" style="text-align: center;">
        <tr>
            <th>ID</th>
            <th>用户名</th>
            <th>职位</th>
            <th>真实姓名</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="staff">
        <tr>
            <td>${staff.id}</td>
            <td>${staff.staffname}</td>
            <td>${staff.job}</td>
            <td>${staff.name}</td>
            <td><a href="../dele/delete?staffname=${staff.staffname}">删除</a></td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
