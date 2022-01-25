<%-- 
    Document   : Jsp
    Created on : Apr 13, 2021, 12:05:16 PM
    Author     : user new
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor='blue'>
        <%
            String name,lastname,email,phono;
           name = request.getParameter("n1");
           lastname = request.getParameter("n2");
           email = request.getParameter("n3");
           phono = request.getParameter("n4");
           out.println("<html><h1>"+"First Name:<br>"+name+"<br>"+"Last Name:<br>"+lastname+"<br>"+"email:<br>"+email+"<br>"+"Phone-Number:<br>"+phono+"</h1></html>");
        %>
    </body>
</html>
