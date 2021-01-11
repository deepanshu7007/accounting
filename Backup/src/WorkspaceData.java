
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.border.DropShadowBorder;
import org.jdesktop.swingx.JXButton;
public class WorkspaceData implements ActionListener{
//class ButtonClickListener implements ActionListener{
//      public void actionPerformed(ActionEvent e) {
//         String command = e.getActionCommand();  
//         if( command.equals( "OK" ))  {
//            
//         }
//         else if( command.equals( "Submit" ) )  {
//            statusLabel.setText("Submit Button clicked."); 
//         }
//         else  {
//            statusLabel.setText("Cancel Button clicked.");
//         }  	
//      }		
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//   }
    public static DefaultTableModel model;
    public static JTable table;
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
System.setProperty("apple.laf.useScreenMenuBar", "true");
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
System.setProperty("apple.laf.useScreenMenuBar", "true");
System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame frame = new JFrame();
        frame.setSize(800,400);
        Object o[][] = new Object[][]{{"Deepanshu","Choudhary","Tatiksha","Choudhary"},
            {"","","",""}};
        String title[] = new String[]{"Name","Age","Rollno","Time"};
        
        model = new DefaultTableModel(o,title);
        table = new JTable();
        table.setModel(model);
        table.setBounds(0, 0, 200, 200);
        table.setModel(model);
        
        JButton button = new JButton("Press me");
        button.setSize(30,30);
        button.addActionListener(new WorkspaceData()); 
        JXButton b=new JXButton("Press ME");
        button.setBounds(100,100,50,50);
        frame.add(table);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.insertRow(0, new Object[]{"Kali","Nookar","Tikshu","Choudhary"});
        model.fireTableDataChanged();
//        table.repaint();
    }
}
