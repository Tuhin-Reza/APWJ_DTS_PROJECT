<%--
  Created by IntelliJ IDEA.
  User: MY PC
  Date: 12/26/2022
  Time: 1:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form:form action="post" modelAttribute="registration">
    <table>
        <tr>
            <td><label>Full Name</label></td>
            <td>
                <form:input type="text" path="fullName" id="fullName" />
                <form:errors path="fullName" style="color:red" />
            </td>
        </tr>
        <tr>
            <td><label>Age</label></td>
            <td>
                <form:input type="numbere" path="Age" id="Age"/>
                <form:errors path="Age" style="color:red" />
            </td>
        </tr>
        <tr>
            <td><label>Phone Number</label></td>
            <td>
                <form:input type="text" path="phoneNumber" id="phoneNumber" />
                <form:errors path="phoneNumber" style="color:red" />
            </td>
        </tr>
        <tr>
            <td><label>Present Address</label></td>
            <td>
                <form:input type="text" path="presentAddress" id=""presentAddress" />
                <form:errors path=""presentAddress" style="color:red" />
            </td>
        </tr>
        <tr>
            <td><label>Permanent Address</label></td>
            <td>
                <form:input type="text" path="permanentAddress" id="permanentAddress" />
                <form:errors path="permanentAddress" style="color:red" />
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
            <td><label>Email</label></td>
            <td>
                <form:input type="text" path="email" id="email" />
                <form:errors path="email" style="color:red" />
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
            <td colspan="2"><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form:form>

</body>
</html>
