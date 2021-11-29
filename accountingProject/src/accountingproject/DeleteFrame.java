package accountingproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class deletePanel {

    deletePanel(String NAME_OF_TABLE) throws ClassNotFoundException, SQLException {

        searchPanel sp = new searchPanel(NAME_OF_TABLE);
        sp.table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
                    String query = "DELETE FROM " + NAME_OF_TABLE + " WHERE ALIAS=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, sp.table.getValueAt(sp.table.getSelectedRow(), sp.table.getSelectedColumn()).toString());
                    int a = JOptionPane.showConfirmDialog(sp, "Are you sure?");
                    if (a == JOptionPane.YES_OPTION) {
                        ps.executeUpdate();

                    }

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(searchPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    public static void main(String[] args) {

    }
}
