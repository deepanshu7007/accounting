package accountingproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class modifyPanel {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        final String NAME_OF_TABLE = "GROUPMASTER";
        addPanel panel = new addPanel();
        panel.groupMaster();
        searchPanel sp = new searchPanel(NAME_OF_TABLE);
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
                        panel.nameField.setText(rs.getString("NAME"));
                        panel.aliasField.setText(rs.getString("ALIAS"));
                        panel.jc.setSelectedItem(rs.getString("HEAD_ALIAS"));
                        panel.priorityField.setText(rs.getString("PRIORITY"));
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
}
