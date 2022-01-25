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

public class NewServlet extends HttpServlet {

  @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("doGet");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><h1>It works!!</h1></html>");
        String name,lastname,email,phono;
           name = req.getParameter("n1");
           lastname = req.getParameter("n2");
           email = req.getParameter("n3");
           phono = req.getParameter("n4");
           System.out.println("name\n"+name+"Last Name:\n"+lastname+"email:\n"+email+"Phone-Number:\n"+phono);
           out.println("<html><h1>"+"First Name:<br>"+name+"<br>"+"Last Name:<br>"+lastname+"<br>"+"email:<br>"+email+"<br>"+"Phone-Number:<br>"+phono+"</h1></html>");
    }
}

