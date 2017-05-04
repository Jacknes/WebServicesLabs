<%-- 
    Document   : register
    Created on : Mar 17, 2017, 8:22:27 PM
    Author     : Jack
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <h1>Register</h1>
        <form action="welcome.jsp" method="POST">
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
        </form>
        
    </body>
</html>
