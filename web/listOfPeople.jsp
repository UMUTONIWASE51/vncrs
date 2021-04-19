<%-- 
    Document   : listOfPeolple
    Created on : Apr 10, 2021, 12:20:21 PM
    Author     : Planet Innovation
--%>

<%@page import="com.src.domain.Person"%>
<%@page import="java.util.List"%>
<%@page import="com.src.service.RegistrationServiceImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View People</title>
    </head>
    <body>
       <div class="wrapper">
            <table border="1" style="">
            <thead style="background-color: blue">
                <tr>
                    <th>person Id</th>
                    <th>First Name</th>
                    <th>last Name</th>
                    <th>date of Birth</th>
                    <th>Gender</th>
                    <th>national Id</th>
                    <th>email</th>
                    <th>phone Number</th>
               <th> Actions </th>
                </tr>
            </thead>
            <tbody>
                <%
//                    gendao<Student> dao = new gendao<Student>(Student.class);
//                    List<Student> studentview = dao.findAll();
//                    for (Student s: studentview) {
                        RegistrationServiceImpl regserv = new RegistrationServiceImpl();
                        List<Person> viewPerson = regserv.getAllPeople();
                        for(Person p : viewPerson){
                        
                %>       
                <tr>
                    <td><%= p.getPersonId() %></td>
                    <td><%= p.getFirstName() %></td>
                    <td><%= p.getLastName() %></td>
                    <td><%= p.getDob()%></td>
                    <td><%= p.getGender() %></td>
                    <td><%= p.getNid() %></td>
                    <td><%= p.getEmail()  %></td>
                    <td><%= p.getPhone() %></td>
<!--                    <td><a href="UpdateStudentFormClient.jsp?id=<%=p.getPersonId() %>">Update</a> <a href="Delete_Student_Form.jsp?id=<%=p.getPersonId() %>">Delete</a></td>-->
                    <td><a href="UpdatePerson.jsp?Id=<%=p.getPersonId() %>">Update</a> <a href="deletePerson.jsp?Id=<%=p.getPersonId() %>">Delete</a></td>
<!--                    <td></td>-->
                    
                    
                </tr>
                <% }%>
   
            </tbody>
        </table>
        </div>
    </body>
</html>
