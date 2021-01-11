/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testingswings;
/**
 *
 * @author  Brijesh Sah
 */
public class MainForm extends javax.swing.JFrame {
     
    /** Creates new form MainForm */
    public MainForm() {
        initComponents();
    }
     
    /** This method is called from within the constructor to
     * initialize the form and adding listener
      
     */
    
    private void initComponents() {
 
        jContainer = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCustomer = new javax.swing.JMenuItem();
        mnuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        jMenu1.setText("Forms");
 
        mnuCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        mnuCustomer.setText("Customer");
        mnuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCustomer);
 
        mnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        mnuItem.setText("Item");
        mnuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItem);
 
        jMenuBar1.add(jMenu1);
 
        jMenu2.setText("File");
 
        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
 
        jMenuBar1.add(jMenu2);
 
        setJMenuBar(jMenuBar1);
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        pack();
    }
 
//Displaying the customer form when ever user will click on customer menu item
 
    private void mnuCustomerActionPerformed(java.awt.event.ActionEvent evt) {                                            
        CustomerView cv=new CustomerView();
        jContainer.add(cv);
        cv.setVisible(true);
}                                           
 
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
    }                                          
 
//Displaying the item form when ever user will click on item menu item
    private void mnuItemActionPerformed(java.awt.event.ActionEvent evt) {                                        
        ItemForm iv=new ItemForm();
        jContainer.add(iv);
        iv.setVisible(true);
        
         
    }                                       
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
     
    // Variables declaration - 
    private javax.swing.JDesktopPane jContainer;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mnuCustomer;
    private javax.swing.JMenuItem mnuItem;
    // End of variables declaration
     
} 
 
 
2. ItemForm.java
 
// This class extends JInternalframe when it will be displayed then it will displayed inside MainForm(MDI form).
 
Code:
 
package practise;
import javax.swing.UIManager;
import javax.swing.JFrame;
/**
 *
 * @author  Brijesh Sah
 */
public class ItemForm extends javax.swing.JInternalFrame {
     
    /** Creates new form ItemForm */
    public ItemForm() {
         
        initComponents();
    }
 
    
     
    /** This method is called from within the constructor to
     * initialize the form.
      
     */
    
    private void initComponents() {
//setting various properties so that i can resize or minimize the form
         
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Item Form");
        setMaximumSize(new java.awt.Dimension(800, 600));
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
 
        pack();
    }
     
  
}
