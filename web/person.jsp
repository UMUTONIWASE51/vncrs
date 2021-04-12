<%-- 
    Document   : person
    Created on : Apr 9, 2021, 7:16:48 PM
    Author     : Planet Innovation
--%>

<%@page import="com.src.domain.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Person Registration page</title>
    </head>
    <body>
        <form style="border: 1px solid black;width: 500px;margin: auto;">
            <table border="0">
                <thead>
                    <tr>
                        <th>Person information form</th>
                   </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Person Fname:</td>
                        <td><input type="text" name="firstName"></td>
                    </tr>
                    <tr>
                        <td>Person Lname:</td>
                        <td><input type="text" name="lastName"></td>
                    </tr>
                    <tr>
                        <td>Date of Birth</td>
                        <td><input type="date" name="dob"></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td>
                            <select name="gender">
                                <option>MALE</option>
                                <option>FEMALE</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>nid:</td>
                        <td><input type="text" name="nid"></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email"></td>
                    </tr>
                    <tr>
                        <td>Phone No:</td>
                        <td><input type="text" name="phone"></td>
                    </tr>
                    <tr>
                       <td></td>
                        <td><button type="submit">Next</button></td>
                    </tr>
                    <tr>
                            <td><a href="listOfPeople.jsp">View Details</a></td>
                            
                        </tr>
                </tbody>
            </table>
        </body>
</html>
