package accountingproject;
import java.awt.Color;
import java.sql.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class BasePanels extends JInternalFrame {
    ResultSet rs;
    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    BasePanels(String name)
            {
                try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/accountingdatabase","root","Anshu12345$");  
//here sonoo is database name, root is username and password  
Statement stmt = con.createStatement();  
rs = stmt.executeQuery("select name,alias from "+name+";");
}catch(Exception e){ System.out.println(e);}
    }
    void Masters(String title) throws SQLException {
        JButton add = new JButton("ADD");
        JButton delete = new JButton("DELETE");
        JButton modify = new JButton("MODIFY");
        JButton back = new JButton("BACK");
        JLabel label = new JLabel(title);
        label.setForeground(Color.red);
        JTable jt = new JTable(buildTableModel(rs));
        JScrollPane sp = new JScrollPane(jt);
        setSize(300, 400);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new addPanel(title);
                } catch (SQLException ex) {
                    Logger.getLogger(BasePanels.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BasePanels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new deletePanel(title);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BasePanels.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BasePanels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        modify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("Inside Base Panel");
                    new modifyPanel(title);
                } catch (SQLException ex) {
                    Logger.getLogger(BasePanels.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BasePanels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBounds(400, 200, 500, 600);
        add(label);
        add(sp);
        add(add);
        add(delete);
        add(modify);
        add(back);
        setVisible(true);
    }

    public static void main(String[] args) throws SQLException {
        new BasePanels("itemmaster").Masters("ITEMMASTER");
    }

}
