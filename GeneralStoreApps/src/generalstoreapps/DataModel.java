package generalstoreapps;

import HeadCreationApp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class DataModel {
    String UserName;
    String Password;
    boolean errorCatch;
    String errorMessage;
   
    Statement st;
            DataModel() 
                {
                    try{
                        String myDriver = "org.gjt.mm.mysql.Driver";
                        String myUrl = "jdbc:mysql://localhost/student";
                        Class.forName(myDriver);
                        Connection conn = DriverManager.getConnection(myUrl, "root", "Anshu12345$");
                        st = conn.createStatement();
                        errorCatch=false;
                        System.out.println("Connection Established Successfully");
                    }catch(ClassNotFoundException e)
                    {
                       errorCatch=true; 
                        errorMessage=("There is a Driver error in the system");
                        JOptionPane.showMessageDialog(null, "There is a Driver error in the system");
                    }
                    catch(SQLException e)
                    {
                        errorCatch=true;
                         JOptionPane.showMessageDialog(null, "There is a SQL Error in the system");
                    }
                }

    boolean loginUser(String UserName, String Password) throws SQLException {
        if(errorCatch == true)
        {
            return errorCatch;
        }
        else
        {
            String query = "SELECT USERNAME,PASSWORD FROM STUDENT.LOGINDATA";      
            ResultSet rs = st.executeQuery(query);
            String userName = "",password="";
            while(rs.next())
            {
                userName=rs.getString("USERNAME");
                password=rs.getString("PASSWORD");
            }
            if(userName.equals(UserName)&&password.equals(Password))
            {
                return true;
            }
            else
            {
                errorMessage=errorMessage+","+"User Not Found";
            }
        }
        return errorCatch;
    }

    
   
    void registerUser(String UserName,String Password)
    {
        
    }
   
    
}
