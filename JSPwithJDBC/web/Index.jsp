<%-- 
    Document   : Index
    Created on : May 2, 2021, 11:14:52 AM
    Author     : user new
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="<%= request.getContextPath() %>/Database" method="get">
            <fieldset>
                <legend>Student Information</legend>
                <table border="0" bgcolor="grey">
                    <tr>
                        <td>Student Name</td>
                        <td style="color:red">*</td>
                        <td>
                            <input type="text" name="txtname">
                        </td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td style="color:red">*</td>
                        <td>
                            <input type="password" name="txtpass">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td>
                            <input type="submit" value="Submit">
                            <input type="reset" value="Reset">
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>

