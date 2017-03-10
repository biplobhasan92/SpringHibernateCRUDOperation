<%-- 
    Document   : myForm
    Created on : Jan 9, 2017, 4:05:02 PM
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
        <h1>form page</h1>
        <form action="submit.htm" method="POST">
            <table>
                <tr>
                    <td>ID :</td>
                    <td><input type="number" name="id" value="${edit.id}"/></td>
                </tr>
                <tr>
                    <td>Name :</td>
                    <td><input type="name" name="name" value="${edit.name}"/></td>
                </tr>
                <tr>
                    <td>Email :</td>
                    <td><input type="email" name="email" value="${edit.email}"/></td>
                </tr>
                <tr>
                    <td>DOB :</td>
                    <td><input type="text" name="dob" value="${edit.dob}"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="submit" /></td>
                    
                </tr>
            </table>
        </form>
        <form action="showAll.htm" method="POST">
            <input type="submit" value="Show All"  />
        </form>
    </body>
</html>
