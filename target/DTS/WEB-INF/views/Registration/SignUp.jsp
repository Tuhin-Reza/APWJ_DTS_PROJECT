<%--
  Created by IntelliJ IDEA.
  User: MY PC
  Date: 12/26/2022
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>
<form:form action="submit" modelAttribute="signup">
    <table>
        <tr>
            <td><label>Full Name</label></td>
            <td>
                <form:input type="text" path="name" id="fullName" />
                <form:errors path="name" style="color:red" />
            </td>
        </tr>
        <tr>
            <td><label>Age</label></td>
            <td>
            <form:input type="text" path="age" id="age" />
            <form:errors path="age" style="color:red" />
            </td>

        </tr>
        <tr>
            <td><label>Present Address</label></td>
            <td>
                <form:input type="text" path="address" id="address" />
                <form:errors path="address" style="color:red" />
            </td>
        </tr>
        <tr>
            <td><label>Profession</label></td>
            <td><form:select path="profession" id="profession">
                <form:option value="">Select Profession</form:option>
                <c:forEach items="${enums}" var="value">
                    <option>${value}</option>
                </c:forEach>
            </form:select> <form:errors path="profession" style="color:red" /></td>
        </tr>
        <tr>
            <td><label>User Name</label></td>
            <td>
                <form:input type="text" path="username" id="userName" />
                <form:errors path="username" style="color:red" />
            </td>
        </tr>
        <tr>
            <td><label>Password</label></td>
            <td>
                <form:input type="password" path="password" id="password" />
                <form:errors path="password" style="color:red" />
            </td>
        </tr>
        <tr>
            <td><label></label></td>
            <td colspan="2">
                <input type="submit" value="Submit">
                <input type="reset" value="Reset">

            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
