<%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/12/27
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <script>
        function addContent() {
            var id=document.getElementById('id').value;
            var content=document.getElementById('content').value;
            var numsize=document.getElementById('numsize');
            if(content.length <= 50&&content!=0){
                window.location.href="http://www.dssjl.top//PhoneInfo/info/addReplies?id="+id+"&content="+content;
            }else {
                numsize.innerHTML="你输入的内容为空，超过50个字！"
            }
        }
    </script>
</head>
<body>

<c:forEach items="${lists}" var="info">
    <h2>${info.title}</h2>
    <p style="font-size: 15px;">发表于： ${info.reportTime}</p>
    <p>${info.content}</p>

    <h4>读者回应</h4>
    <c:forEach items="${repliesList}" var="replies">
    <div style="background:darkgrey;margin-top: 10px;margin-bottom: 10px;padding: 5px;">
        <p style="margin: 5px;font-size: 15px">发表于：${replies.replyTime}</p>
        <p style="margin: 5px;">${replies.content}</p>
    </div>
    </c:forEach>
    <div style="margin-top: 10px;margin-bottom: 10px;">
        <p>快速回复（字数50字以内）</p>
        <input type="hidden" name="id" id="id" value="${info.id}" />
        <textarea id="content" name="content"></textarea><p style="color:red;font-size: 15px" id="numsize"></p>
        <input type="button" value="提交" onclick="addContent()">
        <a href="showAll">返回首页</a>
    </div>
</c:forEach>
</body>
</html>
