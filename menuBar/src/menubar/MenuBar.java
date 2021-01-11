package menubar;
import java.awt.event.*;
import javax.swing.*;
class MenuBar {
    JMenuItem size;
    JMenuItem color;
public MenuBar()
{
JFrame myframe = new JFrame();
JMenuBar menubar = new JMenuBar();
JMenu menu = new JMenu("size");
 size= new JMenuItem("size");
color = new JMenuItem("color");
//size.addActionListener(new myClass()) ;
//color.addActionListener(new myClass1()) ;
menu.add(size);
menu.add(color);
menubar.add(menu);
myframe.setJMenuBar(menubar);
myframe.setVisible(true);
}
public void size(ActionListener e)
{   
    color.addActionListener(e) ;
}
public void color(ActionListener evt)
{
    size.addActionListener(evt);
}
}

