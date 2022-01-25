package com.experiment5;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestExperiment extends HttpServlet {
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
       
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        System.out.println(name);
        Connection con;
        try {
             Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/freshdryfruits", "root",
				"");
                System.out.println(".............Connection Established..................");
                PreparedStatement stmt = con.prepareStatement("INSERT INTO users(Name,ContactNumber,Address,Email,Password) values (?,?,?,?,?,?)");
                stmt.setString(1,name);
                stmt.setString(2,contact);
                stmt.setString(3,address);
                stmt.setString(4,email);
                stmt.setString(5,password);
        } catch (SQLException exception) {
		exception.printStackTrace();
	} catch (ClassNotFoundException ex) {
            Logger.getLogger(RequestExperiment.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
       
        }
    }
}