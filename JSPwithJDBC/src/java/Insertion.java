/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user new
 */
public class Insertion extends HttpServlet {

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
            PreparedStatement pst;

            int cnt = 0;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "mysql");

                pst = con.prepareStatement("insert into login values(?,?)");

                pst.setString(1, name);
                pst.setString(2, pass);
                //pst.setString(3, address);

                cnt = pst.executeUpdate();

                if (cnt > 0) {
                    System.out.print("name:\n" + name + "\n" + "pass:\n" + pass+ "\n" + "address:\n");
                    System.out.println("updated succefully");
                } else {
                    System.out.println("updation failed");
                }
            } catch (Exception ex) {
                System.out.print(ex);
            }

        }

    }
}
