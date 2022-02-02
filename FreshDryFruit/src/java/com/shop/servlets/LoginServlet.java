package com.shop.servlets;

import com.shop.dao.UserDao;
import com.shop.entities.Message;
import com.shop.entities.User;
import com.shop.helper.ConnectionProvider;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public LoginServlet() {
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet LoginServlet</title>");
        out.println("</head>");
        out.println("<body>");
        String userName = request.getParameter("email");
        String userPassword = request.getParameter("password");
        UserDao dao = new UserDao(ConnectionProvider.getConnection());
        User u = dao.getUserByEmailAndPassword(userName, userPassword);
        if (u == null) {
            Message msg = new Message("Invalid details try with another!", "error", "alert-danger");
            
            HttpSession s = request.getSession();
                     response.sendRedirect("LoginPage.jsp");
            s.setAttribute("msg",msg);
            
        } else {
            System.out.println((new StringBuilder()).append("current user name is :").append(u.getName()).toString());
            HttpSession s = request.getSession();
            s.setAttribute("currentUser", u);
            response.sendRedirect("ProfilePage.jsp");
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    public String getServletInfo() {
        return "Short description";
    }
}
