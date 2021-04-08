<%-- 
    Document   : belonging
    Created on : Apr 7, 2021, 8:29:41 PM
    Author     : Planet Innovation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <bodystyle="margin: 20px">
        <h1>BELONGINGS </h1>
       <form action="userlog-response.jsp">
            <input style="padding: 8px" type="text" placeholder="belongingId" >
            <input style="padding: 8px" type="text" placeholder="name" >
            <input style="padding: 8px" type="text" placeholder="type" >
            <input style="padding: 8px" type="text" placeholder="brand" >
            <button style="padding: 8px" type="save">SAVE</button>
            <button style="padding: 8px" type="update">UPDATE</button>
            <button style="padding: 8px" type="delete">DELETE</button>
            <button style="padding: 8px" type="display">DISPLAY</button>
        </form>
    </body>
</html>
