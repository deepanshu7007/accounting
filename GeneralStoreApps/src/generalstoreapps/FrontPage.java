package generalstoreapps;

import HeadCreationApp.ControlForHead;
import HeadCreationApp.MainGroupView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.input.MouseButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FrontPage extends javax.swing.JFrame {

    public FrontPage() {

        initComponents();
//        jButton1.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello World"); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
    }

    void displayErrorMessage(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrontPagePane = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        GroupMastMenu = new javax.swing.JMenu();
        MGroupItem = new javax.swing.JMenuItem();
        SGroupItem = new javax.swing.JMenuItem();
        InventoryMenu = new javax.swing.JMenu();
        SettingMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FrontPagePane.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout FrontPagePaneLayout = new javax.swing.GroupLayout(FrontPagePane);
        FrontPagePane.setLayout(FrontPagePaneLayout);
        FrontPagePaneLayout.setHorizontalGroup(
            FrontPagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        FrontPagePaneLayout.setVerticalGroup(
            FrontPagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        GroupMastMenu.setText("Group Master");

        MGroupItem.setText("Menu Group");
        MGroupItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MGroupItemActionPerformed(evt);
            }
        });
        GroupMastMenu.add(MGroupItem);

        SGroupItem.setText("Sub-group");
        GroupMastMenu.add(SGroupItem);

        MenuBar.add(GroupMastMenu);

        InventoryMenu.setText("Inventory Master");
        MenuBar.add(InventoryMenu);

        SettingMenu.setText("Settings");
        MenuBar.add(SettingMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrontPagePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FrontPagePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void MGroupAction(MouseAc CalcButton)
    {
        
        MGroupItem.addMouseListener(CalcButton);
        
        
    }
    private void MGroupItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MGroupItemActionPerformed
        
    }//GEN-LAST:event_MGroupItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel FrontPagePane;
    private javax.swing.JMenu GroupMastMenu;
    private javax.swing.JMenu InventoryMenu;
    private javax.swing.JMenuItem MGroupItem;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem SGroupItem;
    private javax.swing.JMenu SettingMenu;
    // End of variables declaration//GEN-END:variables
}
