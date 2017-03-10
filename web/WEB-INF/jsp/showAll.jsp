<%-- 
    Document   : showAll
    Created on : Jan 9, 2017, 5:58:06 PM
    Author     : APCL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <table >
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Email</td>
                <td>Date OF Birth</td>
                <td>Do Delete</td>
            </tr>
            <c:forEach items="${mymodel}" var="item"> 
                <tr>
                    <td>${item.id}</td>
                    <td> ${item.name}</td>
                    <td>${item.email}</td>
                    <td colspan="1">${item.dob}</td>
                </tr>
                <tr>
                    <td colspan="2"><a href="deleteItem.htm?id=${item.id}">delete</a></td>
                    <td colspan="2"><a href="editeItem.htm?id=${item.id}&name=${item.name}&email=${item.email}&dob=${item.dob}">Edit</a></td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
