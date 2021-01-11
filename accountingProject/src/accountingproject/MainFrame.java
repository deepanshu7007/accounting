package accountingproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MainFrame extends JFrame {

    MainFrame() {
        JMenu menu;
        JMenuItem i1, i2, i3;
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Masters");
        i1 = new JMenuItem("Group Master");
        i2 = new JMenuItem("Sub-Group Master");
        i3 = new JMenuItem("Account Master");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        mb.add(menu);
        setJMenuBar(mb);
        setBounds(400, 200, 600, 400);
        setLayout(null);
        setVisible(true);

        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BasePanels bp = new BasePanels("groupmaster");
                try {
                    bp.Masters("GROUP MASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BasePanels bp = new BasePanels("subgroupmaster");
                try {
                    bp.Masters("SUB GROUP MASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        i3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BasePanels bp = new BasePanels("accountmaster");
                try {
                    bp.Masters("ACCOUNT MASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
