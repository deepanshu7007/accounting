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
        final String NAME_OF_TABLE = "SUBGROUPMASTER";
        addPanel panel = new addPanel();
        panel.subGroupMaster();
        searchPanel sp = new searchPanel(NAME_OF_TABLE);
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
                        for(int i=1;i<=rs.getMetaData().getColumnCount();i++)
                        {
                            panel.subGroupField.get(i-1).setText(rs.getString(i));
                            
                        }
                    }
                    panel.add.setText("EDIT");
//                    panel.subGroupField.get(3).setText("Tatti");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
}
