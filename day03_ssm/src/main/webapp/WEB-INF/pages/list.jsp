<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>成功访问了</h1>
    <c:forEach items="${list}" var="account">
        ${account.name}   ${account.money} </br>
    </c:forEach>
</body>
</html>
