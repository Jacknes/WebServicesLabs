<%-- 
    Document   : one
    Created on : 23/03/2017, 1:31:58 PM
    Author     : 12545404
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%
     // Retrieve the value (if any) of the form field called 'submitted'
    String submitted = request.getParameter("submitted");
   
     // If the Java variable 'submitted' is not null AND 'submitted' equals "yes"
    if (submitted != null && submitted.equals("yes")) {
    %>
       <% 
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String favcol = request.getParameter("favcol");
            String TOS = request.getParameter("tos");
            
            
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
    </body> 
    <%   } else {
        %>
        <body>
            <p>Sorry, you must agree to the Terms of Service.</p>
            <p>Click <a href="register.jsp">here</a> to go back.</p>
        </body>
    <% }
%>
  
<% 
  } else {
%>
      <body>
        <h1>Register</h1>
        <form action="one.jsp" method="POST">
            <table>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>Full Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                 <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <input type="radio" name="gender" value="Male" checked>Male 
                        <br> 
                        <input type="radio" name="gender" value="Female">Female
                    </td>
                </tr>
                <tr>
                    <td>Favourite Colour</td>
                    <td>
                        <select name="favcol">
                            <option value ="red">Red</option>
                            <option value ="blue">Blue</option>
                            <option value ="green">Green</option>
                            <option value ="yellow">Yellow</option>
                            <option value ="purple">Purple</option>
                        </select> 
                    </td>
                </tr>
                <tr>
                    <td>Agree to TOS</td>
                    <td><input type="checkbox" name="tos"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Register"></td>
                </tr>

            </table>
            <input type="hidden" name="submitted" value="yes">
        </form>
    </body>
<%
  }
%>
   
</html>
