<%-- 
    Document   : SignUpProcess
    Created on : Apr 19, 2021, 1:47:05 PM
    Author     : Planet Innovation
--%>

<%@page import="com.src.domain.User"%>
<%@page import="com.src.service.AuthenticationServiceImpl"%>
<%@page import="com.src.service.AuthenticationService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");
    
    if(!password.equals(password2)){
        out.print("Password Does not much");
    }
    AuthenticationService authenticationService = new AuthenticationServiceImpl();
    User user = new User();
    
    try{
        authenticationService.signup(username, password);
        out.print("Account Created");
    }catch(Exception e){
        out.print(e.getMessage());
    }
    
%>