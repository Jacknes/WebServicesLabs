<%-- 
    Document   : login
    Created on : 06/04/2017, 12:55:50 PM
    Author     : 12545404
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="loginAction.jsp" method="POST">
            <table>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
