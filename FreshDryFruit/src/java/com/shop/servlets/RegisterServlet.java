package com.shop.servlets;

import com.shop.dao.UserDao;
import com.shop.entities.User;
import com.shop.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet
{

    public RegisterServlet()
    {
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        String check = request.getParameter("check");
        if(check == null)
        {
            out.println("PLEASE ACCEPT TERMS AND CONDITIONS");
        } else
        {
            String name = request.getParameter("user_name");
            String email = request.getParameter("user_email");
            String password = request.getParameter("user_password");
            String address = request.getParameter("user_address");
            User user = new User(name, email, password, address);
            UserDao dao = new UserDao(ConnectionProvider.getConnection());
            if(dao.saveUser(user))
                out.println("done");
            else
                out.println("error");
        }
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        processRequest(request, response);
    }

    public String getServletInfo()
    {
        return "Short description";
    }
}
