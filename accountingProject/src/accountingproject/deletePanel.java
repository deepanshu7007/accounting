package accountingproject;
import com.mysql.jdbc.Statement;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class deletePanel extends JFrame {
   JPanel jp=new JPanel();
    deletePanel() {
        
        JTextField deleteField = new JTextField(20);
        
        JButton deleteButton = new JButton("Delete Button");
        setFocusable(false);
        deleteField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
                    Statement stmt = (Statement) con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT NAME,ALIAS FROM SUBGROUPMASTER");
                    JTable j = new JTable(BasePanels.buildTableModel(rs)) {
                        public boolean editCellAt(int row, int column, java.util.EventObject e) {
                            return false;
                        }
                    };
                    j.setFocusable(false);
                    j.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent me) {
                            if (me.getClickCount() == 2) {
                                // to detect doble click events
                                JTable target = (JTable) me.getSource();
                                int row = target.getSelectedRow(); // select a row                    // select a column
                                deleteField.setText(j.getValueAt(row, 0).toString()); // get the value of a row and column.
                            }
                        }
                    });
                    JScrollPane js = new JScrollPane(j);
                    js.setSize(400, 400);
                    deleteButton.requestFocus();
                    
                    jp.add(js);
                    jp.setBounds(50,40,400,400);
                    add(jp);
                } catch (Exception ex) {
                    Logger.getLogger(addPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
            remove(jp);
            repaint();
            revalidate();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new Time(e.getWhen()).toString());
            }
        });
        setTitle("Delete Panel");
        add(new JLabel("DELETE PANEL"));
        add(deleteField);
        add(deleteButton);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBounds(Toolkit.getDefaultToolkit().getScreenSize().width / 6, Toolkit.getDefaultToolkit().getScreenSize().height / 6, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there
    setExtendedState(JFrame.NORMAL);
    setUndecorated(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new deletePanel();
    }
}
