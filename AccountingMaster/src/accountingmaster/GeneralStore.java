package accountingmaster;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;

public class GeneralStore extends javax.swing.JFrame {
  MasterDisplay gm;
    public GeneralStore() {
         
        try 
         {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneralStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenuPanel = new javax.swing.JPanel();
        GroupMasterButton = new javax.swing.JButton();
        SBMasterButton = new javax.swing.JButton();
        AMMasterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Accounting"); // NOI18N

        GroupMasterButton.setText("Group Master");
        GroupMasterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupMasterButtonActionPerformed(evt);
            }
        });

        SBMasterButton.setText("Sub-Group Master");
        SBMasterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBMasterButtonActionPerformed(evt);
            }
        });

        AMMasterButton.setText("Account Master");

        javax.swing.GroupLayout MainMenuPanelLayout = new javax.swing.GroupLayout(MainMenuPanel);
        MainMenuPanel.setLayout(MainMenuPanelLayout);
        MainMenuPanelLayout.setHorizontalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GroupMasterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(SBMasterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(AMMasterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainMenuPanelLayout.setVerticalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GroupMasterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBMasterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMMasterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GroupMasterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupMasterButtonActionPerformed
        
       
        
        MainMenuPanel.setVisible(false);
        MasterDisplay md = new MasterDisplay();
        md.setBounds(20, 20, 626,392);
        this.setTitle("GroupMaster");
        this.add(md);
        
    }//GEN-LAST:event_GroupMasterButtonActionPerformed

    private void SBMasterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBMasterButtonActionPerformed
        
    }//GEN-LAST:event_SBMasterButtonActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AMMasterButton;
    public javax.swing.JButton GroupMasterButton;
    public javax.swing.JPanel MainMenuPanel;
    public javax.swing.JButton SBMasterButton;
    // End of variables declaration//GEN-END:variables
}
