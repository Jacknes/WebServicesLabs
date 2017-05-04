<%-- 
    Document   : loginAction
    Created on : 06/04/2017, 12:57:28 PM
    Author     : 12545404
--%><%@page import="uts.wsd.*"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% String filePath = application.getRealPath("WEB-INF/users.xml"); %>
    <jsp:useBean id="diaryApp" class="uts.wsd.DiaryApplication" scope="application">
        <jsp:setProperty name="diaryApp" property="filePath" value="<%=filePath%>"/>
    </jsp:useBean>
    
    <% Users users = new Users();
    users = diaryApp.getUsers();
    User result = new User();
    if (users != null){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
    
        result = users.login(email, password);
        
    }
        
    
    
    %>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>loginAction</title>
    </head>
    
    <% if (result != null) { 
    
    session.setAttribute("user", result);
    
    %>
    <body>
        <p>Login Successful. Click <a href="index.jsp">here</a> to return to the main page. </p>
    </body>
    
    <% } else {%>
    <body>
        <p>Password incorrect. Click <a href="login.jsp">here</a> to try again.</p>
    </body>
    
    
    
    <%}%>
</html>
