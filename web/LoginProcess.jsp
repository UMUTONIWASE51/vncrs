<%-- 
    Document   : LoginProcess
    Created on : Apr 19, 2021, 12:55:05 PM
    Author     : Planet Innovation
--%>

<%@page import="com.src.service.RegistrationServiceImpl"%>
<%@page import="com.src.service.RegistrationService"%>
<%@page import="com.src.domain.User"%>
<%@page import="com.src.dao.GeneralDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String u
    RegistrationService  registrationService = new RegistrationServiceImpl();
//    GeneralDao<User> userDao = new GeneralDao<User>(User.class);
%>