<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm整合</title>
</head>
<body>
    <a href="account/findAll">查询所有</a>
<hr/>
    <form action="account/saveAccount" method="post">
        账户名称：<input type="text" name="name"/><br/>
        账户金额：<input type="text" name="money"><br/>
        <input type="submit" value="保存"/> </form>
</body>
</html>
