<%-- 
    Document   : index
    Created on : 30/03/2017, 12:57:46 PM
    Author     : 12545404
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.wsd.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diary Keeper</title>
    </head>
     <body>
           <h1>Diary Keeper</h1>
        <%
            User user = (User)session.getAttribute("user");
            
            if(user != null){
        %>
      
        
        <p>You are logged in as <%= user.getName()%> &lt;<%= user.getEmail() %>&gt;</p>
        <p><a href="logout.jsp">Logout</a></p>
        <p><a href="edit_user.jsp">My Account</a></p>
        
  
    
    <% } else {
    %>
        
        <p>You are not logged in</p>
        <p><a href="login.jsp">Login</a> | <a href="register.jsp">Register</a></p>
   
    
    <% }
    %>
     </body>
    
</html>
