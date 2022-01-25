package accountingproject;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
public class DPanel extends JPanel {
	public DPanel() {
		setForeground(Color.CYAN);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{288, 45, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{13, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridheight = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 0, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 0;
		gbc_formattedTextField.gridy = 8;
		add(formattedTextField, gbc_formattedTextField);

	}
public void paint(Graphics g)
{
	g.drawRect(0,0, getWidth(),getHeight()/4 );
}
public static void main(String[] args)
{
	DPanel d = new DPanel();
	JFrame frame = new JFrame();
	frame.add(d);
	frame.setVisible(true);
}
}
