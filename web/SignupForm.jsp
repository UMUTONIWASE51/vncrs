<%-- 
    Document   : LoginForm
    Created on : Apr 19, 2021, 12:40:28 PM
    Author     : Planet Innovation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Form</title>
    </head>
    <body>
        <div>
            <form action="SignupProcess.jsp" method="POST">
                <table>
                    <h1>Sign Up Form</h1>
                    <tr>
                        <td>User Name:</td>
                        <td><input type="text" name="username"/></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password"/></td>
                    </tr>
                    <tr>
                        <td>Conf-Password:</td>
                        <td><input type="password" name="password2"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><button type="submit">Signup</button></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
