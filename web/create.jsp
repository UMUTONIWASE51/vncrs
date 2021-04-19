<%-- 
    Document   : create
    Created on : Apr 16, 2021, 11:23:24 AM
    Author     : Planet Innovation
--%>

<%@page import="com.src.service.RegistrationService"%>
<%@page import="com.src.service.RegistrationServiceImpl"%>
<%@page import="com.src.dao.GeneralDao"%>
<%@page import="com.src.db.utils"%>
<%@page import="java.util.Date"%>
<%@page import="com.src.domain.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <body>
        <%
    utils u = new utils();
    String FirstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String Date = request.getParameter("dob");
    String gender = request.getParameter("gender");
    String nid = request.getParameter("nid");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    
    Person p = new Person(FirstName, lastName, u.getDate("Date"), gender, nid, email, phone);
    RegistrationService serv = new RegistrationServiceImpl();
    serv.createNewPerson(p);
    out.println("Registration was successfull");
    response.sendRedirect("listOfPeople.jsp");
            %>
            </body>
</html>
