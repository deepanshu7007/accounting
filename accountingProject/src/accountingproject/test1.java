package accountingproject;
import java.awt.Component;

import javax.swing.*;
public class test1 {
    public static void main(String[] args)
{
    Itempanel1 ip = new Itempanel1();
    JFrame frame = new JFrame();
    int i=0;
    for(Component c : ip.getComponents())
    {    
        if(c.getClass().equals(javax.swing.JTextField.class) || c.getClass().equals(javax.swing.JComboBox.class))
        {    
        System.out.println(i+1+"=====>"+c.getClass());
            i++;
        }
        }
    frame.getContentPane().add(ip);
    frame.pack();
    frame.setVisible(true);
}
}

