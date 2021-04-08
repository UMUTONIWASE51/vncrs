<%-- 
    Document   : socialClass
    Created on : Apr 7, 2021, 8:41:04 PM
    Author     : Planet Innovation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="margin: 20px">
        <h1>SOCIAL CLASS </h1>
       <form action="userlog-response.jsp">
            <input style="padding: 8px" type="text" placeholder="classId" >
            <input style="padding: 8px" type="text" placeholder="description" >
           
            <select style="padding: 8px" type="text" > select socialClass
                <option value="Upper">UPPER</option>
                <option value="Middle"> MIDDLE</option>
                <option value="Working">WORKING</option>
                <option value="Poor">POOR</option>
                
            </select>
            <button style="padding: 8px" type="save">SAVE</button>
            <button style="padding: 8px" type="update">UPDATE</button>
            <button style="padding: 8px" type="delete">DELETE</button>
            <button style="padding: 8px" type="display">DISPLAY</button>
        </form>
    </body>
</html>
