package menubar;

import java.awt.EventQueue;
import static java.awt.EventQueue.invokeLater;
import static javax.swing.SwingUtilities.invokeLater;

public class MainClass {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               MenuBar mb= new MenuBar();
        ControllingClass cs = new ControllingClass(mb); //To change body of generated methods, choose Tools | Templates.
            }
            });
}
}
