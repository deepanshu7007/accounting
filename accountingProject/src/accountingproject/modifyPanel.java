package accountingproject;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
public class modifyPanel implements ActionListener {

    addPanel panel;
    searchPanel sp;
    Connection con;
    int accountMasterColumns;

    void subGroupModify() throws SQLException, ClassNotFoundException {
        final String NAME_OF_TABLE = "SUBGROUPMASTER";
        panel = new addPanel(NAME_OF_TABLE);
        panel.add.setText("EDIT");
        sp = new searchPanel(NAME_OF_TABLE);
        panel.add.removeActionListener(panel.add.getActionListeners()[0]);
        panel.add.setActionCommand(NAME_OF_TABLE);
        panel.add.addActionListener(this);
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
        panel.revalidate();
        sp.table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
                    String query = "SELECT * FROM " + NAME_OF_TABLE + " WHERE ALIAS=?";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1, sp.table.getValueAt(sp.table.getSelectedRow(), sp.table.getSelectedColumn()).toString());
                    ResultSet rs = pstmt.executeQuery();

                    while (rs.next()) {
                        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                            panel.subGroupField.get(i - 1).setText(rs.getString(i));
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    void groupModify() throws SQLException, ClassNotFoundException {
        final String NAME_OF_TABLE = "GROUPMASTER";
        panel = new addPanel(NAME_OF_TABLE);
        
        panel.add.setText("EDIT");
        sp = new searchPanel(NAME_OF_TABLE);
        panel.add.removeActionListener(panel.add.getActionListeners()[0]);
        panel.add.setActionCommand("GROUPMASTER");
        panel.add.addActionListener(this);
        Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
        panel.revalidate();
        sp.table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    
                    String query = "SELECT * FROM " + NAME_OF_TABLE + " WHERE ALIAS=?";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1, sp.table.getValueAt(sp.table.getSelectedRow(), sp.table.getSelectedColumn()).toString());
                    ResultSet rs = pstmt.executeQuery();

                    while (rs.next()) {
                        for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
                            panel.groupFields.get(i - 1).setText(rs.getString(i));
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    void accountModify() throws SQLException, ClassNotFoundException {
        final String NAME_OF_TABLE = "ACCOUNTMASTER";
        panel = new addPanel(NAME_OF_TABLE);
        panel.add.setText("EDIT");
        sp = new searchPanel(NAME_OF_TABLE);
        panel.revalidate();
        panel.add.removeActionListener(panel.add.getActionListeners()[0]);
        panel.add.setActionCommand(NAME_OF_TABLE);
        panel.add.addActionListener(this);
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
        sp.table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                try {
                    String query = "SELECT * FROM " + NAME_OF_TABLE + " WHERE ALIAS=?";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1, sp.table.getValueAt(sp.table.getSelectedRow(), sp.table.getSelectedColumn()).toString());
                    ResultSet rs = pstmt.executeQuery();
                    accountMasterColumns = rs.getMetaData().getColumnCount();
                    while (rs.next()) {
                        for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
                            panel.AccountField.get(i - 1).setText(rs.getString(i));
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(modifyPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    void itemModify() throws SQLException, ClassNotFoundException {
        final String NAME_OF_TABLE = "ITEMMASTER";
        panel = new addPanel(NAME_OF_TABLE);
        panel.add.setText("EDIT");
        sp = new searchPanel(NAME_OF_TABLE);
        panel.revalidate();
        panel.add.removeActionListener(panel.add.getActionListeners()[0]);
        panel.add.setActionCommand(NAME_OF_TABLE);
        panel.add.addActionListener(this);
        Class.forName("com.mysql.jdbc.Driver");  
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
        sp.table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                    System.out.println("Hello World");

                try {
                    String query = "SELECT * FROM " + NAME_OF_TABLE + " WHERE ALIAS=?";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1, sp.table.getValueAt(sp.table.getSelectedRow(), sp.table.getSelectedColumn()).toString());
                    ResultSet rs = pstmt.executeQuery();
                    System.out.println("Clicked For the Items selected");
                    while (rs.next()) {
                        for (int i = 1; i <= rs.getMetaData().getColumnCount()-2; i++) {
                            panel.ItemFields.get(i-1).setText(rs.getString(i));
                        }
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(modifyPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    modifyPanel(String s) throws SQLException, ClassNotFoundException {
if(s.equals("SUBGROUPMASTER"))
        subGroupModify();
if(s.equals("GROUPMASTER"))
        groupModify();
if(s.equals("ACCOUNTMASTER"))
        accountModify();
if(s.equals("ITEMMASTER"))      
        itemModify();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ACCOUNTMASTER")) {
            try {
                String s = ("UPDATE ACCOUNTMASTER SET NAME=?,SUBGROUP=?,B_NAME=?,ADDRESS=?,CITY=?,STATE=?,PINCODE=?,PHONE=?,E_MAIL=?,OD_NAME=?,PANNUM=?,TANNUM=?,GSTNUM=?,USER_IN=?,OP_BAL=? WHERE ALIAS=?");
                PreparedStatement st = con.prepareStatement(s);
                st.setString(1, panel.AccountField.get(0).getText());
                for (int i = 2; i < accountMasterColumns-1; i++) {
                    System.out.println(i+"->"+panel.AccountField.get(i).getText());
                    st.setString(i , panel.AccountField.get(i).getText());
                }
                st.setString(16,panel.AccountField.get(1).getText());
                st.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(modifyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getActionCommand().equals("GROUPMASTER")) {
                try {
                String s = "UPDATE GROUPMASTER SET NAME=?,PRIORITY=?,HEAD_ALIAS=? WHERE ALIAS=?";
                PreparedStatement st = con.prepareStatement(s);
                st.setString(1, panel.groupFields.get(0).getText());
                System.out.println(1 +"->"+ panel.groupFields.get(0).getText());
                st.setString(2, panel.groupFields.get(2).getText());
                System.out.println(2 +"->"+ panel.groupFields.get(2).getText());
                st.setString(3, panel.jc.getSelectedItem().toString());
                System.out.println(3 +"->"+ panel.jc.getSelectedItem().toString());
                st.setString(4, panel.groupFields.get(1).getText());
                System.out.println(4 +"->"+ panel.groupFields.get(1).getText());
                st.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(modifyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getActionCommand().equals("SUBGROUPMASTER")) {
                try {
                String s = "UPDATE SUBGROUPMASTER SET NAME=?,PRIORITY=?,GROUP_ALIAS=? WHERE ALIAS=?";
                PreparedStatement st = con.prepareStatement(s);
                st.setString(1, panel.subGroupField.get(0).getText());
                st.setString(2, panel.subGroupField.get(2).getText());
                st.setString(3,panel.subGroupField.get(3).getText());
                st.setString(4,panel.subGroupField.get(1).getText());
                st.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(modifyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getActionCommand().equals("ITEMMASTER")) {
                try {
                    System.out.println("OutputText");
                String s = "UPDATE ITEMMASTER SET NAME=?,GST=?,TAXPERC=?,HSNCODE=?,TYPE=?,INVENTORY=?,DESCRIPTION=?,DIVISION=?,CATAGORY=?,P_RATE=?,S_RATE=?,MRP=?,MARGIN=?,CODEBELONGS=?,SALESFACTOR=?,UNIT_1=?,UNIT_2=?,CONVERSIONFACT=? where ALIAS=?";
                PreparedStatement st = con.prepareStatement(s);
                
                st.setString(1,panel.ItemFields.get(0).getText());
                st.setString(2,panel.ItemFields.get(1).getText());
                st.setString(3,panel.ItemFields.get(2).getText());
                st.setString(4,panel.ItemFields.get(3).getText());
                st.setString(5,"");
                st.setString(6,"");
                st.setString(7,panel.ItemFields.get(4).getText());
                st.setString(8,panel.ItemFields.get(5).getText());
                st.setString(9,panel.ItemFields.get(6).getText());
                st.setString(10,panel.ItemFields.get(7).getText());
                st.setString(11,panel.ItemFields.get(8).getText());
                st.setString(12,panel.ItemFields.get(9).getText());
                st.setString(13,panel.ItemFields.get(10).getText());
                st.setString(14,panel.ItemFields.get(11).getText());
                st.setString(15,panel.ItemFields.get(12).getText());
                st.setString(16,panel.ItemFields.get(13).getText());
                st.setString(17,panel.ItemFields.get(14).getText());
                st.setString(18,panel.ItemFields.get(15).getText());
                st.setString(19,panel.ItemFields.get(16).getText());
                st.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(modifyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
