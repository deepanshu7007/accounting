package HeadCreationApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class ControlForHead {
    public JPanel frontPanel;
    public MainGroupView mgv;
    
    public ControlForHead(JPanel FrontPagePane, MainGroupView mainGroupView) {
        this.frontPanel=frontPanel;
        this.mgv=mgv;
        this.mgv.exitActionPerformed(new ExitButtonListener());
    }
    class CreateButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            frontPanel.remove(mgv);
            frontPanel.validate();
        }
    }
     class UpdateButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
      class DeleteButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
      class ExitButtonListener implements ActionListener
{   
    String UserName,Password;
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
 }
        class ViewButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
}
