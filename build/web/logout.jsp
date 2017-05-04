<%-- 
    Document   : logout
    Created on : 30/03/2017, 1:02:05 PM
    Author     : 12545404
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
        <%
            session.invalidate();
        %>
    </head>
    <body>
        <p>You have been logged out. Click <a href="index.jsp">here</a> to return to the main page.</p>
    </body>
</html>
