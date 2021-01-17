package accountingproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class addPanel extends JFrame {

    private JButton add = new JButton("ADD");
    private JButton back = new JButton("BACK");
    private JTextField nameField,priorityField, aliasField;
    ArrayList<JTextField> groupFields,subGroupField,AccountField;
    private ResultSet rs;
    JComboBox jc;
    private JLabel Title = new JLabel();
    void groupMaster() {
        groupFields = new ArrayList<>();
        Title.setText("GROUP MASTER");
        jc = new JComboBox();
        jc.addItem("ASSERTS");
        jc.addItem("LIABILITY");
        jc.addItem("INCOME");
        jc.addItem("EXPENDITURE");
        add(new JLabel("Type"));
        add(jc);
        jc.setName("");
        revalidate();
        groupFields.add(nameField);
        groupFields.add(aliasField);
        groupFields.add(priorityField);
        add.addActionListener((ActionEvent e) -> {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
                PreparedStatement stmt = con.prepareStatement("INSERT INTO GROUPMASTER(NAME,ALIAS,HEAD_ALIAS,PRIORITY) VALUES (?,?,?,?)");
                stmt.setString(1, nameField.getText());
                stmt.setString(2, aliasField.getText());
                stmt.setString(3, jc.getSelectedItem().toString());
                stmt.setInt(4, Integer.parseInt(priorityField.getText()));
                int i = stmt.executeUpdate();
                System.out.println(i + " Records Inserted");
                con.close();
            } catch (Exception ev) {
                System.out.println(ev);
            }
        });

        back.addActionListener((ActionEvent e) -> {

        });
    }

    void subGroupMaster() throws ClassNotFoundException, SQLException {
        subGroupField = new ArrayList<>();
        Title.setText("SUB GROUP MASTER");
        JTextField groupField = new JTextField();
        groupField.setColumns(20);
        JLabel groupName = new JLabel("Group-Name:");
        groupField.setEnabled(false);
        add(groupName);
        add(groupField);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
        Statement stmt = con.createStatement();
        rs = stmt.executeQuery("select NAME,ALIAS from subgroupmaster");
        JTable j = new JTable(BasePanels.buildTableModel(rs)) {
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        j.setFocusable(false);
        subGroupField.add(nameField);
        subGroupField.add(aliasField);
        subGroupField.add(priorityField);
        subGroupField.add(groupField);
        j.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 2) {     // to detect doble click events
                    JTable target = (JTable) me.getSource();
                    int row = target.getSelectedRow(); // select a row
                    // select a column
                    groupField.setText(j.getValueAt(row, 1).toString()); // get the value of a row and column.
                }
            }
        });
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        add(sp);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
                    PreparedStatement pstmt = con.prepareStatement("INSERT INTO SUBGROUPMASTER(NAME,ALIAS,PRIORITY,GROUP_ALIAS) VALUES (?,?,?,?);");
                    pstmt.setString(1, nameField.getText());
                    pstmt.setString(2, aliasField.getText());
                    pstmt.setString(3, priorityField.getText());
                    pstmt.setString(4, groupField.getText());

                    int i = pstmt.executeUpdate();
                    System.out.println(i + " records inserted");
                    JOptionPane.showMessageDialog(rootPane, "Inserted Successfull");
                } catch (SQLException ex) {
                    System.out.println(ex);
                    JOptionPane.showMessageDialog(rootPane, "Inserted unuccessfull");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(addPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        con.close();
    }

    void accountMaster() throws ClassNotFoundException, SQLException {
        priorityField.setEnabled(false);
        add(new JLabel("Head:"));
        JTextField head = new JTextField(20);
        add(head);
        AccountField.add(head);
        String labelNames[] = {"Businerss-Name", "Address", "City", "State", "Pincode", "Phone-Number", "E-Mail", "Overdraft", "PAN-NO", "TIN", "GST-IN", "User-Name"};
        JLabel l[] = new JLabel[labelNames.length];
        JLabel obLabel = new JLabel("Opening-Balance");
        JTextField ob = new JTextField(10);
        ob.setText("");
        JTextField j[] = new JTextField[labelNames.length];
        for (int i = 0; i < labelNames.length; i++) {
            j[i] = new JTextField(20);
            AccountField.add(j[i]);
            j[i].setName(labelNames[i]);
            l[i] = new JLabel(labelNames[i]);
            add(l[i]);
            add(j[i]);
        }
        add(obLabel);
        add(ob);
        add(new JLabel("Comment:"));
        JTextArea jt;
        add(jt = new JTextArea(5, 20));
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
        final Statement stmt = con.createStatement();
        head.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                try {
                    ResultSet rs = stmt.executeQuery("SELECT NAME,ALIAS FROM SUBGROUPMASTER");
                    JTable j = new JTable(BasePanels.buildTableModel(rs)) {
                        public boolean editCellAt(int row, int column, java.util.EventObject e) {
                            return false;
                        }
                    };
                    j.setFocusable(false);
                    j.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent me) {
                            if (me.getClickCount() == 1) {
                                // to detect doble click events
                                JTable target = (JTable) me.getSource();
                                int row = target.getSelectedRow(); // select a row                    // select a column
                                head.setText(j.getValueAt(row, 0).toString()); // get the value of a row and column.
                            }
                        }
                    });
                    JScrollPane js = new JScrollPane(j);
                    js.setSize(400, 400);
                    jt.requestFocus();
                    JOptionPane.showMessageDialog(rootPane, js);
                } catch (Exception ex) {
                    Logger.getLogger(addPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
//                remove(panel); 
//                repaint();
//                revalidate(); 
            }

        });
        add.addActionListener((ActionEvent evt) -> {
            try {
                System.out.println("Hello World");
                String statement = "'" + nameField.getText() + "','" + aliasField.getText() + "','";
                for (int i = 0; i < labelNames.length; i++) {
                    statement = statement + j[i].getText() + "','";
                }
                statement = statement + head.getText() + "','" + jt.getText() + "'," + String.format("%.2f", Double.parseDouble(ob.getText()));
                int val = stmt.executeUpdate("INSERT INTO ACCOUNTMASTER (NAME,ALIAS,B_NAME,ADDRESS,CITY,STATE,PINCODE,PHONE,E_MAIL,OD_NAME,PANNUM,TANNUM,GSTNUM,USER_IN,SUBGROUP,COMMENT,OP_BAL) VALUES (" + statement + ");");
                if (val == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Record Successfully Inserted");
                } else {

                }
                System.out.println(val);
            } catch (Exception ev) {
                JOptionPane.showMessageDialog(rootPane, "Something went wrong(PLEASE CHECK ALIAS-NAME)");
            }
        });
    }

    addPanel() throws SQLException, ClassNotFoundException {
        JLabel Name = new JLabel("Name");
        Name.setForeground(Color.red);
        JLabel Priority = new JLabel("Priority");
        JLabel Alias = new JLabel("Alias");
        nameField = new JTextField();
        nameField.setColumns(20);
        priorityField = new JTextField();
        priorityField.setColumns(20);
        aliasField = new JTextField();
        aliasField.setColumns(20);
        add(Title);
        add(Name);
        add(nameField);
        add(Priority);
        add(priorityField);
        add(Alias);
        add(aliasField);
//        groupMaster();
//        subGroupMaster();
//        accountMaster();
        add(back);
        add(add);
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
        setSize(500, 600);
        setVisible(true);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new addPanel();
    }
}
