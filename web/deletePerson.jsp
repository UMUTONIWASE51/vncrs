<%-- 
    Document   : deletePerson
    Created on : Apr 16, 2021, 9:25:05 PM
    Author     : Planet Innovation
--%>

<%@page import="com.src.domain.Person"%>
<%@page import="com.src.service.RegistrationServiceImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <%

 Integer personId = request.getParameter(id);
//    GenericDAO<Course> gen = new GenericDAO<Course>(Course.class);
RegistrationServiceImpl regserv = new RegistrationServiceImpl();
      Person p = regserv.getPersonById(personId);
//    Student stu = st.findById(id);
    
    System.out.println(stu.toString());
    st.delete(stu);
    
            out.println("Delete successfully");
            response.sendRedirect("DisplayStudent.jsp");

      %> 
    </body>
</html>
