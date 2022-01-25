package Views;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DTextField extends JTextField implements DComponent{
	public DTextField()
	{
		this.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e)
		{
			JTextField field;
			if(e.getKeyChar() == KeyEvent.VK_ESCAPE) {
				 field = (JTextField)e.getSource();
				JFrame frame = (JFrame)field.getRootPane().getParent();
				frame.dispose();
			}
			if(e.getKeyChar()==KeyEvent.VK_ENTER)
			{
				field=(JTextField)e.getSource();
				field.transferFocus();
			}
		}
		});
	}
	@Override
	public String get()
	{
		return getText();
	}
	@Override
	public void set(String s)
	{
		setText(s);
	}
	@Override
	public String getName()
	{
		return super.getName();
	}
}
