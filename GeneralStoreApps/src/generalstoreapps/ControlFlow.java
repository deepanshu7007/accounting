package generalstoreapps;
import HeadCreationApp.MainGroupView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

public class ControlFlow {
     private LoginPage Lpage;
     private DataModel DModel;
     private FrontPage Fpage;
    public ControlFlow(LoginPage Lpage,DataModel DModel,FrontPage Fpage)
    {
        this.Lpage = Lpage;
        this.DModel = DModel;
        this.Fpage=Fpage;
        this.Lpage.loginAccessListener(new LoginButtonListener());
        this.Fpage.MGroupAction(new MGItemActionPer());
    }
    void displayFrontPage()
    {
        this.Lpage.dispose();
        new FrontPage().setVisible(true);
    }
    void displayErrorPage(String s)
    {
        Lpage.displayErrorMessage(s);
    }
    void addToFrontPage(JPanel c)
    {
//        Fpage.addingComponent(c);
    }

class LoginButtonListener implements ActionListener
{   
    String UserName,Password;
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
           UserName=Lpage.getUserName();
           Password=Lpage.getPassword();
           if(DModel.loginUser(UserName,Password))
           {
               System.out.println("Entered in the phase");
               displayFrontPage();
           }
           else
           {
               Lpage.displayErrorMessage(DModel.errorMessage);
           }
           
        }
        catch(Exception exp)
        {
            exp.printStackTrace(System.out);
        }
    }
    
 }
class MGItemActionPer implements MouseEvent
{

       
        @Override
        public int getScreenX() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getScreenY() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getClientX() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getClientY() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean getCtrlKey() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean getShiftKey() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean getAltKey() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean getMetaKey() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public short getButton() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public EventTarget getRelatedTarget() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg, int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, short buttonArg, EventTarget relatedTargetArg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public AbstractView getView() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getDetail() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void initUIEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg, int detailArg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getType() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public EventTarget getTarget() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public EventTarget getCurrentTarget() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public short getEventPhase() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean getBubbles() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean getCancelable() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public long getTimeStamp() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void stopPropagation() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void preventDefault() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void initEvent(String eventTypeArg, boolean canBubbleArg, boolean cancelableArg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

}
}
