<%-- 
    Document   : Database.jsp
    Created on : May 2, 2021, 11:20:05 AM
    Author     : user new
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                String id = request.getParameter("txtStudentID");
                String name = request.getParameter("txtStudentFirstName");
                String address = request.getParameter("txtStudentaddress");
                
Connection con=null;
Statement stmt=null;
try{  
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "mysql");
    stmt=con.createStatement();
   
    String query = "insert into form(id,name,address) values ('"+name+"','"+id+"','"+address+"')";
    out.print("executed sucessfully");
    int status = stmt.executeUpdate(query);
    if(status==0)  
    {  
        out.print("Record is not inserted in the database");  
        }
        else  
        {    
            out.print("Record is inserted successfully in the database");  
            }
     stmt.close();  
  con.close();
  }catch(Exception ex){  
      out.print(ex.getMessage());
      }
                

        %>
    </body>
</html>
