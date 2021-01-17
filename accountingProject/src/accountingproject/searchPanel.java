package accountingproject;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
class searchPanel extends JFrame  {
    JRadioButton rb1, rb2;
    JTable table;
    JButton b;
JTextField text = new JTextField(20);

    searchPanel(String name) throws ClassNotFoundException, SQLException {
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
        final Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT NAME,ALIAS FROM "+name);
        rb1 = new JRadioButton("NAME");
        rb1.setSelected(true);
        rb2 = new JRadioButton("ALIAS");
         table = new JTable(BasePanels.buildTableModel(rs));
        
        table.setSize(200,200);
        JScrollPane js= new JScrollPane(table);
        js.setSize(200, 200);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        table.changeSelection(0, 0, false, false);
        table.setRowSelectionAllowed(true);
        table.setSelectionBackground(Color.RED);
        add(rb1);
        add(rb2);
        add(text);
        addWindowListener( new WindowAdapter() {
    public void windowOpened( WindowEvent e ){
        text.requestFocus();
    }
});
        add(js);
        setSize(300, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        new searchPanel("ACCOUNTMASTER");
    }
}
