<%-- 
    Document   : updateOp
    Created on : Apr 18, 2021, 8:45:38 PM
    Author     : Planet Innovation
--%>

<%@page import="com.src.dao.GeneralDao"%>
<%@page import="com.src.domain.Person"%>
<%@page import="com.src.db.utils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            utils ut = new utils();
            String FirstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String Date = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String nid = request.getParameter("nid");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            Person p = new Person(FirstName, lastName, ut.getDate("Date"), gender, nid, email, phone);
//            Studentdao sd = new  Studentdao(Student.class);
            GeneralDao<Person> gnric = new GeneralDao<>(Person.class);
            gnric.update(p);
//           sd.update(s);
            out.println("Updated successfully");
            response.sendRedirect("listOfPeople.jsp");
        %>
    </body>
</html>
