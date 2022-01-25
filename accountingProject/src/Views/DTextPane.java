package Views;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class DTextPane extends JTextPane implements DComponent{
	DTextPane()
	{
		addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent e)
			{
				if(e.getKeyChar() == KeyEvent.VK_ESCAPE) {
					JTextPane field= (JTextPane)e.getSource();
					JFrame frame = (JFrame)field.getRootPane().getParent();
					frame.dispose();
				}
			}
			});
		
	}
	public String get()
	{
		return getText();
	}
	public void set(String s)
	{
		setText(s);
	}
	public String getName()
	{
		return super.getName();
	}
}
