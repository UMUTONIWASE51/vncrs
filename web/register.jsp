<%-- 
    Document   : register
    Created on : Apr 10, 2021, 10:51:08 AM
    Author     : Planet Innovation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <form style="border: 1px solid black;width: 500px;margin: auto;">
            <table border="0" cellspacing="1">
                <thead>
                    <tr>
                        <th>REGISTRATION FORM</th>
                    </tr>
                </thead>
                <tbody>
                    <table border="1" >
            
            <tbody>
               <tr>
                   <td>Village name</td>
                        <td><input type="text" name="village"></td>
                </tr>
                <tr>
                   <td>Registration date</td>
                        <td><input type="date" name="registrationDate"></td>
                </tr>
            </tbody>
        </table>
            
                    <tr>
                       <table border="1" cellspacing="2">
            <thead>
                    <tr>
                        <th>Person information form</th>
                   </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Fname</td>
                        <td><input type="text" name="firstName"></td>
                    </tr>
                    <tr>
                        <td>Lname</td>
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
                        <td>NID</td>
                        <td><input type="text" name="nid"></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email"></td>
                    </tr>
                    <tr>
                        <td>Phone No</td>
                        <td><input type="text" name="phone"></td>
                    </tr>
                    <tr>
                        <td>Belonging</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                    <td>Social Class</td>
                        <td>
                            <select name="socialClass">
                                <option>UPPER</option>
                                <option>MIDDLE</option>
                                <option>WORKING</option>
                                <option>POOR</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                       <td><button type="submit">SUBMIT</button></td>
                    </tr>
                    
            </tbody>
        </table>

                    </tr>
                </tbody>
            </table>

            <table border="1" cellspacing="1">
                <thead>
                    <tr>
                        <th>NAMES</th>
                        <th>DOB</th>
                        <th>GENDER</th>
                        <th>NID</th>
                        <th>PHONE</th>
                        <th>EMAIL</th>
                        <th>EDIT</th>
                        <th>DELETE</th>
                    </tr>
                    
                     <tr>
                       <td><button type="submit">REGISTER</button></td>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>

        
</body>
</html>
