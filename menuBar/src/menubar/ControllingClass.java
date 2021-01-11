package menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllingClass {
    MenuBar mb;
    public ControllingClass(MenuBar mb) {
        this.mb=mb;
        this.mb.size(new myClass());
        this.mb.color(new myClass1());
    }
    

class myClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Hello World");
	}
}
class myClass1 implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Hello World1");
	}
}
}
