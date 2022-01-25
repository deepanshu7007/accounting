package CheckCodes;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnterKeyCheck extends JFrame implements ActionListener{
	private JTextField Field1;
	private JTextField Field2;
	private JTextField Field3;
	private JTextField Field4;
	EnterKeyCheck()
	{
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Field1 = new JTextField();
		
//		Field1.addActionListener(this);
		getContentPane().add(Field1);
		Field1.setColumns(10);
		Field2 = new JTextField();
		Field2.setColumns(10);
		getContentPane().add(Field2);
//		Field2.addActionListener(this);
		Field3 = new JTextField();
		Field3.setColumns(10);
		getContentPane().add(Field3);
//		Field3.addActionListener(this);
		Field4 = new JTextField();
		Field4.setColumns(10);
//		Field4.addActionListener(this);
		
		getContentPane().add(Field4);
		setVisible(true);
SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				setVisible(true);
				
			}
		});
//		Field2.requestFocusInWindow();
	}
	public static void main(String[] args)
{
	new EnterKeyCheck();
}
	@Override
	
		public void actionPerformed(ActionEvent e) {
//			System.out.println("Pressed Enter Key");
//JTextField field = (JTextField)e.getSource();
//field.transferFocusBackward();
		
	}
}
