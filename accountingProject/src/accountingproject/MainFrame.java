package accountingproject;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class MainFrame extends JFrame {
    JDesktopPane desktopPane;
    BasePanels bp;
	MainFrame(String s) {
        JMenu masters,inventory;
        JMenuItem groupMaster, subGroupMaster, accountMaster,divisionMaster,catagoryMaster,unitMaster,itemMaster;
        JMenuBar mb = new JMenuBar();
        masters = new JMenu("Masters");
        inventory = new JMenu("Inventory");
        groupMaster = new JMenuItem("GROUPMASTER");
        subGroupMaster = new JMenuItem("SUBGROUPMASTER");
        accountMaster = new JMenuItem("ACCOUNTMASTER");
        divisionMaster = new JMenuItem("DIVISIONMASTER");
        catagoryMaster = new JMenuItem("CATAGORYMASTER");
        unitMaster = new JMenuItem("UNITMASTER");
        itemMaster = new JMenuItem("ITEMMASTER");
        desktopPane = new JDesktopPane();
        desktopPane.setSize(rootPane.getPreferredSize());
        masters.add(groupMaster);
        masters.add(subGroupMaster);
        masters.add(accountMaster);
        inventory.add(divisionMaster);
        inventory.add(catagoryMaster);
        inventory.add(unitMaster);
        inventory.add(itemMaster);
        mb.add(masters);
        mb.add(inventory);
        setJMenuBar(mb);
            setTitle(s);
//        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setBounds(400, 200, 600, 400);
//        setLayout(null);
        add(desktopPane);
        setVisible(true);
//        pack();
divisionMaster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 bp = new BasePanels("DIVISIONMASTER");
                 bp.setResizable(true);
                 bp.setClosable(true);
                 desktopPane.add(bp);
                try {
                    bp.Masters("DIVISIONMASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
catagoryMaster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 bp = new BasePanels("CATAGORYMASTER");
                 bp.setResizable(true);
                 bp.setClosable(true);
                desktopPane.add(bp);
                try {
                    bp.Masters("CATAGORYMASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
unitMaster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 bp = new BasePanels("UNITMASTER");
                 bp.setResizable(true);
                 bp.setClosable(true);
                desktopPane.add(bp);
                try {
                    bp.Masters("UNITMASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
itemMaster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 bp = new BasePanels("ITEMMASTER");bp.setResizable(true);
                 bp.setClosable(true);
                desktopPane.add(bp);
                try {
                    bp.Masters("ITEMMASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        groupMaster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 bp = new BasePanels("groupmaster");bp.setResizable(true);
                 bp.setClosable(true);
                desktopPane.add(bp);
                 try {
                    bp.Masters("GROUPMASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        subGroupMaster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 bp = new BasePanels("subgroupmaster");bp.setResizable(true);
                 bp.setClosable(true);
                desktopPane.add(bp);
                 try {
                    bp.Masters("SUBGROUPMASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        accountMaster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 bp = new BasePanels("accountmaster");bp.setResizable(true);
                 bp.setClosable(true);
                desktopPane.add(bp);
                 try {
                    bp.Masters("ACCOUNTMASTER");
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//            setUIFont (new javax.swing.plaf.FontUIResource("Serif",Font.PLAIN,12));
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        MainFrame mf = new MainFrame("ACCOUNTING SOFTWARE");
    }
    public static void setUIFont (javax.swing.plaf.FontUIResource f){
    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get (key);
      if (value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put (key, f);
      }
    } 
}
