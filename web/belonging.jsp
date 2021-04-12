<%-- 
    Document   : belonging
    Created on : Apr 10, 2021, 10:39:28 AM
    Author     : Planet Innovation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Belongings Registration Page</title>
    </head>
    <body>
        <form style="border: 1px solid black;width: 500px;margin: auto;">
        <table border="0">
            <thead>
                <tr>
                    <th>Belongings Form</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Belonging Name:</td>
                        <td><input type="text" name="name"></td>
                </tr>
                <tr>
                   <td>Belonging type:</td>
                        <td><input type="text" name="type"></td>
                </tr>
                <tr>
                    <td>Belonging brand:</td>
                    <td><input type="text" name="brand"></td>
                </tr>
               <tr>
                       <td></td>
                        <td><button type="submit">Next</button></td>
                    </tr>
            </tbody>
        </table>

    </body>
</html>
