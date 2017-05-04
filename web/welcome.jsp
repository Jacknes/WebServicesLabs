<%-- 
    Document   : welcome
    Created on : Mar 17, 2017, 8:38:54 PM
    Author     : Jack
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.wsd.*"%>
<!DOCTYPE html>
<html>
    <% String filePath = application.getRealPath("WEB-INF/users.xml"); %>
    <jsp:useBean id="diaryApp" class="uts.wsd.DiaryApplication" scope="application">
        <jsp:setProperty name="diaryApp" property="filePath" value="<%=filePath%>"/>
    </jsp:useBean>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome.jsp</title>
        
    </head>
     <% 
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String favcol = request.getParameter("favcol");
            String TOS = request.getParameter("tos");
            
            User user = new User(email, name, password, gender, favcol);
            session.setAttribute("user", user);
            Users users = new Users();
            users = diaryApp.getUsers();
            User userTemp = new User();
            userTemp = users.login(email, password);
            if (userTemp == null) {
             users.addUser(user);
            }
            diaryApp.updateXML(users);
            
            ArrayList<User> list = new ArrayList<User>();
            if (users != null){
            boolean containsUser = false;
               for (User us : users.getList()) {
                    if (us.getEmail().equals(email)){
                        containsUser = true;
                    }
                        
                }
               
               if (containsUser == false) {
                   list.add(user);
                   users.addUser(user);
                   diaryApp.updateXML(users);
               }
              
        
            }
           
        %>
    <% 
        if(TOS != null) 
            {
    %>    
    <body bgcolor="<%= favcol%>">
        <p>Welcome, <%= name %></p
        <p>Your Email is <%= email%>.</p>
        <p>Your password is <%= password%>.</p>
        <p>Your gender is <%= gender%>.</p>
        <p>Your favourite colour is <%= favcol%>.</p>
        <p>Click <a href="index.jsp">here</a> to proceed to the main page.
    </body> 
          <%   } else {
        %>
        <body>
            <p>Sorry, you must agree to the Terms of Service.</p>
            <p>Click <a href="register.jsp">here</a> to go back.</p>
        </body>
    <% }
%>
    
</html>
