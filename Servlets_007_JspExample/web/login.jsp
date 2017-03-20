<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body style="text-align: center">
<br/>
<table style="text-align: center; margin-left: auto; margin-right: auto">
    <form action="login" method="post">

        <tr>
            <td>Email</td>
            <td><input type="text" name="email" placeholder="Email.."/></td>
        </tr>

        <tr>
            <td>Password</td>
            <td><input type="password" name="pass" placeholder="Password.."/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Login"></td>
        </tr>

    </form>
</table>
<br/>
<h3 style="color: red">${message}</h3>
</body>
</html>
