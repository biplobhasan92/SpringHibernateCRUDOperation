<%-- 
    Document   : show
    Created on : Jan 9, 2017, 4:12:32 PM
    Author     : APCL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Show Page</h1>
        <p>ID : ${emp.id}</p>
        <p>Name : ${emp.name}</p>
        <p>Email : ${emp.email}</p>
        <p>DOB : ${emp.dob}</p>
        <a href="goToForm.htm">Go Form</a>
    </body>
</html>
