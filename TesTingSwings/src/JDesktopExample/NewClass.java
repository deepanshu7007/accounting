package JDesktopExample;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class NewClass extends JFrame
{
    NewClass()
    {
        JInternalFrame iframe1 = new JInternalFrame("frame1",true,true,true,true);
        JInternalFrame iframe2 = new JInternalFrame("frame2",true,true,true,true);
        iframe1.setSize(400,400);
        iframe1.setVisible(true);
        iframe2.setBounds(50,50,400,400);
        iframe2.setVisible(true);
        setSize(1000,1000);
        setTitle("The example");
        JDesktopPane jd = new JDesktopPane();
        jd.setSize(800,800);
        jd.add(iframe1);
        jd.add(iframe2);
        jd.setBackground(Color.red);
        this.add(jd);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new NewClass();
    }
}
