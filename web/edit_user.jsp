<%-- 
    Document   : edit_user
    Created on : 30/03/2017, 1:10:11 PM
    Author     : 12545404
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.wsd.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Account</title>
        <%  
            
            if (request.getParameter("name") != null){
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String favcol = request.getParameter("favcol");
            String TOS = request.getParameter("tos");
            User user = new User(email, name, password, gender, favcol);
            session.setAttribute("user", user);
            }
           
            User user = (User)session.getAttribute("user");
            
            
        %>
    </head>
    <body>
        <h1>My Account</h1>
        <form action="edit_user.jsp" method="POST">
            <table>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="<%=user.getEmail()%>"></td>
                </tr>
                <tr>
                    <td>Full Name</td>
                    <td><input type="text" name="name"value="<%=user.getName()%>"></td>
                </tr>
                 <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"value="<%=user.getPassword()%>"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    
                    <% if(user.getGender().equals("Male")) {
                        %>
                        <td>
                        <input type="radio" name="gender" value="Male" checked>Male 
                        <br> 
                        <input type="radio" name="gender" value="Female">Female
                        </td>
                        
                        <%
                    } else {
                    %>
                     <td>
                        <input type="radio" name="gender" value="Male">Male 
                        <br> 
                        <input type="radio" name="gender" value="Female" checked>Female
                        </td>
                    <% } %>
                    
                </tr>
                <tr>
                    <td>Favourite Colour</td>
                    <td>
                        <select name="favcol">
                            <option value ="red" <%= "Red".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Red</option>
                            <option value ="blue"<%= "Blue".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Blue</option>
                            <option value ="green"<%= "Green".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Green</option>
                            <option value ="yellow"<%= "Yellow".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Yellow</option>
                            <option value ="purple"<%= "Purple".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Purple</option>
                        </select> 
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save"></td>
                </tr>

            </table>
        </form>
                         
              
        <p>Return to the <a href="index.jsp">main page</a>.</p>
    </body>
</html>
