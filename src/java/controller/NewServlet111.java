package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet111 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String Username = request.getParameter("uname");
        String Password = request.getParameter("psw");
        out.println(Username);
        out.println(Password);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws
            ServletException, IOException {
        processRequest(req, res);
    }
}
