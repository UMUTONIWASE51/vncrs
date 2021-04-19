<%-- 
    Document   : UpdateStudent
    Created on : Apr 16, 2021, 9:23:53 PM
    Author     : Planet Innovation
--%>

<%@page import="javax.persistence.Id"%>
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
        <%
//             int id = request.getParameter("Id");
            GeneralDao gen = new GeneralDao<>(Person.class);
       
        
        %>
        
        
        <form action="updateOp.jsp" method="POST">
            
                
                
            
            
<!--            <input value="<%= p.getPersonId() %>" type="number" placeholder="Id" name="Id">-->
            <input value="<%=p.getFirstName()  %>" type="text" placeholder="Insert firstName" name="firstName">
            <input value="<%=p.getLastName() %>" type="text" placeholder="Insert last name" name="lastName">
                <input value="<%=p.getDob() %>"  type="date" placeholder="Insert dob" name="dob">
                <input value ="<%=p.getGender() %>" type="text" placeholder="Insert gender" name="gender">
                <input value=""<%=p.getNid()  %> type="text" placeholder="Insert national id" name="nid">
                <input value="<%=p.getEmail() %>" type="text" placeholder="Insert email" name="email">
                <input value="<%=p.getPhone() %>" type="text" placeholder="Insert phonenumber" name="phone">
               <button type="submit">Update</button>
            
            </form>
         
    </body>
</html>
