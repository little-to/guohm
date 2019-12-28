<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>登录测试页面</title>
<body>
<h2>登录测试</h2>
<form action="login" method="post">
    <font color="red">${requestScope.message}</font>
    <table>
        <tr>
            <td>登录名：</td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
