import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

/*<applet code="RepaintJavaExample.class" width="350" height="150"> </applet>*/
public class FireingExample extends JFrame
{
	public static JFrame frame;
	public static JPanel panel;
	public static void main(String[] args)
	{
		frame = new JFrame("This is a frame");
		panel = new JPanel();
		panel.setSize(400,400);
		panel.setBackground(Color.red);
		frame.setSize(800,600);
		JButton button = new JButton("Press me");
		button.setSize(200,200);
		panel.add(button);
		frame.add(panel);
                Image icon=Toolkit.getDefaultToolkit().getImage("E:\\icon.png"); 
                        frame.setIconImage(icon);
		button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.getContentPane().remove(panel);
                        frame.repaint();
                    }
			
		});
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
