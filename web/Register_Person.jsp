<%-- 
    Document   : Register_Person
    Created on : Apr 16, 2021, 11:22:37 AM
    Author     : Planet Innovation
--%>

<%@page import="com.src.dao.GeneralDao"%>
<%@page import="com.src.domain.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>

            <form action="create.jsp" method="POST">
                <input type="number" placeholder="PersonId" name="id">
                <input type="text" placeholder="Insert firstName" name="firstName">
                <input type="text" placeholder="Insert last name" name="lastName">
                <input type="date" placeholder="Insert dob" name="dob">
                <input type="text" placeholder="Insert gender" name="gender">
                <input type="text" placeholder="Insert national id" name="nid">
                <input type="text" placeholder="Insert email" name="email">
                <input type="text" placeholder="Insert phonenumber" name="phone">
               <button type="submit">Create</button>
            </form>
        </div>
    </body>
</html>
