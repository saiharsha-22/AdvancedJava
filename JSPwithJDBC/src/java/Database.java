/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author user new
 */
public class Database extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String name = request.getParameter("txtname");
            String pass = request.getParameter("txtpass");
            //String address = request.getParameter("txtStudentaddress");
            String htmlRespone = "<html>";
            htmlRespone += "<form>";
            htmlRespone += "<h2>" + "Name is: " + name + "</h2>";
            htmlRespone += "<h2>" + "Password is: " + pass + "</h2>";
            //htmlRespone += "<h2>" + "Address is: " + address + "</h2>";
            htmlRespone += "</form>";
            htmlRespone += "</html>";
            out.println(htmlRespone);
            Connection con;
            Statement stmt;
           try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "mysql");
                stmt = con.createStatement();
                String query = "select * from login where name='"+name+"'";
                ResultSet rs = stmt.executeQuery(query);
                if(rs.next()){
                  out.print("sucess");
                }else{
                    out.print("not sucess!");
                }
               
            } catch (Exception ex) {
                System.out.print(ex);
            }
            
        }

    }
}
