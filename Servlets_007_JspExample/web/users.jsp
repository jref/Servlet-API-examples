<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body style="text-align: center">
<h1>User list</h1>

<table style="margin-left: auto;margin-right: auto" cellspacing="15">
    <c:forEach items="${userList}" var="user" varStatus="counter">
        <tr>
            <td>${counter.index+1}.</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.email}</td>
            <td>(${user.phoneNumber.code})${user.phoneNumber.number}</td>
        </tr>


    </c:forEach>
</table>
</body>
</html>
