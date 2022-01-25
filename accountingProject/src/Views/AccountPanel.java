package Views;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.text.JTextComponent;
import accountingproject.DeleteFrame;
import accountingproject.mainInintials;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountPanel extends JFrame implements MasterPresistables, ActionListener {
	private ArrayList<DComponent> ComponentList;
	private JButton SaveButton;
	private DTextPane AddressField;
	private SearchFrame sf;
	private DTextField NameField;
	private DTextField SubGroupField;
	private DTextField PriorityField;
	private DTextField AliasField;
	private DTextField UserField;
	private DTextField GstField;
	private DTextField StateField;
	private DTextField CityField;
	private DTextField PinCodeField;
	private DTextField EmailField;
	private DTextField PhoneField;
	private DTextPane CommentBox;
	private DTextField PanField, OverdraftField, TinField;
	private mainInintials.MainTools mi;

	@Override
	public String getTitleOfFrame() {
		return "ACCOUNTMASTER";
	}

	public AccountPanel() {
		ComponentList = new ArrayList<DComponent>();
		new mainInintials();
		mi = new mainInintials.MainTools();
		setBounds(100, 100, 859, 725);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 355, 198, 0 };
		gridBagLayout.rowHeights = new int[] { 56, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 0, 0, 0, 24, 37, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblNewLabel_4 = new JLabel("ACCOUNT MASTER");
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setBackground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_4.gridwidth = 2;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);

		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("SUBGROUP");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);

		NameField = new DTextField();
		NameField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_NameField = new GridBagConstraints();
		gbc_NameField.insets = new Insets(0, 0, 5, 5);
		gbc_NameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_NameField.gridx = 0;
		gbc_NameField.gridy = 2;
		getContentPane().add(NameField, gbc_NameField);
		NameField.setColumns(10);
		NameField.setName("NAME");
		ComponentList.add(NameField);
		NameField.addActionListener(this);

		SubGroupField = new DTextField();
		ComponentList.add(SubGroupField);
		SubGroupField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_SubGroupField = new GridBagConstraints();
		gbc_SubGroupField.insets = new Insets(0, 0, 5, 0);
		gbc_SubGroupField.fill = GridBagConstraints.HORIZONTAL;
		gbc_SubGroupField.gridx = 1;
		gbc_SubGroupField.gridy = 2;
		getContentPane().add(SubGroupField, gbc_SubGroupField);
		SubGroupField.setColumns(10);
		SubGroupField.setName("SUBGROUP");
		SubGroupField.addActionListener(this);

		JLabel lblNewLabel_2 = new JLabel("Priority");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Pan-number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);

		PriorityField = new DTextField();
		PriorityField.addActionListener(this);
		ComponentList.add(PriorityField);
		PriorityField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		PriorityField.setColumns(10);
		GridBagConstraints gbc_PriorityField = new GridBagConstraints();
		gbc_PriorityField.insets = new Insets(0, 0, 5, 5);
		gbc_PriorityField.fill = GridBagConstraints.HORIZONTAL;
		gbc_PriorityField.gridx = 0;
		gbc_PriorityField.gridy = 4;
		getContentPane().add(PriorityField, gbc_PriorityField);
		PriorityField.setName("PRIORITY");

		PanField = new DTextField();
		PanField.addActionListener(this);
		ComponentList.add(PanField);
		PanField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		PanField.setColumns(10);
		GridBagConstraints gbc_PanField = new GridBagConstraints();
		gbc_PanField.insets = new Insets(0, 0, 5, 0);
		gbc_PanField.fill = GridBagConstraints.HORIZONTAL;
		gbc_PanField.gridx = 1;
		gbc_PanField.gridy = 4;
		getContentPane().add(PanField, gbc_PanField);
		PanField.setName("PANNUM");

		JLabel lblNewLabel_2_1 = new JLabel("Alias");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1.gridx = 0;
		gbc_lblNewLabel_2_1.gridy = 5;
		getContentPane().add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_2 = new JLabel("GST-IN\r\n");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_2.gridx = 1;
		gbc_lblNewLabel_2_1_2.gridy = 5;
		getContentPane().add(lblNewLabel_2_1_2, gbc_lblNewLabel_2_1_2);

		AliasField = new DTextField();
		AliasField.addActionListener(this);
		ComponentList.add(AliasField);
		AliasField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		AliasField.setColumns(10);
		GridBagConstraints gbc_AliasField = new GridBagConstraints();
		gbc_AliasField.insets = new Insets(0, 0, 5, 5);
		gbc_AliasField.fill = GridBagConstraints.HORIZONTAL;
		gbc_AliasField.gridx = 0;
		gbc_AliasField.gridy = 6;
		getContentPane().add(AliasField, gbc_AliasField);
		AliasField.setName("ALIAS");

		GstField = new DTextField();
		GstField.addActionListener(this);
		ComponentList.add(GstField);
		GstField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GstField.setColumns(10);
		GstField.setName("GSTNUM");
		GridBagConstraints gbc_GstField = new GridBagConstraints();
		gbc_GstField.insets = new Insets(0, 0, 5, 0);
		gbc_GstField.fill = GridBagConstraints.HORIZONTAL;
		gbc_GstField.gridx = 1;
		gbc_GstField.gridy = 6;
		getContentPane().add(GstField, gbc_GstField);

		JLabel lblNewLabel_2_1_1 = new JLabel("User-Name");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_1.gridx = 0;
		gbc_lblNewLabel_2_1_1.gridy = 7;
		getContentPane().add(lblNewLabel_2_1_1, gbc_lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("STATE");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1_1.gridx = 1;
		gbc_lblNewLabel_2_1_1_1.gridy = 7;
		getContentPane().add(lblNewLabel_2_1_1_1, gbc_lblNewLabel_2_1_1_1);

		UserField = new DTextField();
		UserField.addActionListener(this);
		ComponentList.add(UserField);
		UserField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		UserField.setColumns(10);
		GridBagConstraints gbc_UserField = new GridBagConstraints();
		gbc_UserField.insets = new Insets(0, 0, 5, 5);
		gbc_UserField.fill = GridBagConstraints.HORIZONTAL;
		gbc_UserField.gridx = 0;
		gbc_UserField.gridy = 8;
		getContentPane().add(UserField, gbc_UserField);
		UserField.setName("USER_IN");

		StateField = new DTextField();
		StateField.addActionListener(this);
		ComponentList.add(StateField);
		StateField.setName("STATE");
		StateField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		StateField.setColumns(10);
		GridBagConstraints gbc_StateField = new GridBagConstraints();
		gbc_StateField.insets = new Insets(0, 0, 5, 0);
		gbc_StateField.fill = GridBagConstraints.HORIZONTAL;
		gbc_StateField.gridx = 1;
		gbc_StateField.gridy = 8;
		getContentPane().add(StateField, gbc_StateField);

		JLabel lblNewLabel_2_1_1_2 = new JLabel("CITY\r\n");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_1_2.gridx = 0;
		gbc_lblNewLabel_2_1_1_2.gridy = 9;
		getContentPane().add(lblNewLabel_2_1_1_2, gbc_lblNewLabel_2_1_1_2);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("PINCODE");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1_1_1.gridx = 1;
		gbc_lblNewLabel_2_1_1_1_1.gridy = 9;
		getContentPane().add(lblNewLabel_2_1_1_1_1, gbc_lblNewLabel_2_1_1_1_1);

		CityField = new DTextField();
		CityField.addActionListener(this);
		ComponentList.add(CityField);
		CityField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		CityField.setColumns(10);
		GridBagConstraints gbc_CityField = new GridBagConstraints();
		gbc_CityField.insets = new Insets(0, 0, 5, 5);
		gbc_CityField.fill = GridBagConstraints.HORIZONTAL;
		gbc_CityField.gridx = 0;
		gbc_CityField.gridy = 10;
		getContentPane().add(CityField, gbc_CityField);
		CityField.setName("CITY");

		PinCodeField = new DTextField();
		PinCodeField.addActionListener(this);
		ComponentList.add(PinCodeField);
		PinCodeField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		PinCodeField.setColumns(10);
		GridBagConstraints gbc_PinCodeField = new GridBagConstraints();
		gbc_PinCodeField.insets = new Insets(0, 0, 5, 0);
		gbc_PinCodeField.fill = GridBagConstraints.HORIZONTAL;
		gbc_PinCodeField.gridx = 1;
		gbc_PinCodeField.gridy = 10;
		getContentPane().add(PinCodeField, gbc_PinCodeField);
		PinCodeField.setName("PINCODE");

		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("Overdraft");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_2_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2_1_1_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_1_2_1.gridx = 0;
		gbc_lblNewLabel_2_1_1_2_1.gridy = 11;
		getContentPane().add(lblNewLabel_2_1_1_2_1, gbc_lblNewLabel_2_1_1_2_1);

		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("Tin Number");
		lblNewLabel_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_2_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2_1_1_2_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1_2_1_1.gridx = 1;
		gbc_lblNewLabel_2_1_1_2_1_1.gridy = 11;
		getContentPane().add(lblNewLabel_2_1_1_2_1_1, gbc_lblNewLabel_2_1_1_2_1_1);

		OverdraftField = new DTextField();
		OverdraftField.addActionListener(this);
		ComponentList.add(OverdraftField);
		GridBagConstraints gbc_OverdraftField = new GridBagConstraints();
		gbc_OverdraftField.insets = new Insets(0, 0, 5, 5);
		gbc_OverdraftField.fill = GridBagConstraints.BOTH;
		gbc_OverdraftField.gridx = 0;
		gbc_OverdraftField.gridy = 12;
		getContentPane().add(OverdraftField, gbc_OverdraftField);
		OverdraftField.setName("OP_BAL");

		TinField = new DTextField();
		TinField.addActionListener(this);
		ComponentList.add(TinField);
		GridBagConstraints gbc_TinField = new GridBagConstraints();
		gbc_TinField.insets = new Insets(0, 0, 5, 0);
		gbc_TinField.fill = GridBagConstraints.BOTH;
		gbc_TinField.gridx = 1;
		gbc_TinField.gridy = 12;
		TinField.setName("TANNUM");
		getContentPane().add(TinField, gbc_TinField);

		JLabel lblNewLabel_2_1_1_2_1_2 = new JLabel("EMAIL\r\n");
		lblNewLabel_2_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_2_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_2_1_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1_1_2_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_1_2_1_2.gridx = 0;
		gbc_lblNewLabel_2_1_1_2_1_2.gridy = 13;
		getContentPane().add(lblNewLabel_2_1_1_2_1_2, gbc_lblNewLabel_2_1_1_2_1_2);

		JLabel lblNewLabel_2_1_1_2_1_1_1 = new JLabel("PHONE-NUMBER\r\n");
		lblNewLabel_2_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_2_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_2_1_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1_1_2_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1_2_1_1_1.gridx = 1;
		gbc_lblNewLabel_2_1_1_2_1_1_1.gridy = 13;
		getContentPane().add(lblNewLabel_2_1_1_2_1_1_1, gbc_lblNewLabel_2_1_1_2_1_1_1);

		EmailField = new DTextField();
		EmailField.addActionListener(this);
		ComponentList.add(EmailField);
		EmailField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		EmailField.setColumns(10);
		GridBagConstraints gbc_EmailField = new GridBagConstraints();
		gbc_EmailField.insets = new Insets(0, 0, 5, 5);
		gbc_EmailField.fill = GridBagConstraints.HORIZONTAL;
		gbc_EmailField.gridx = 0;
		gbc_EmailField.gridy = 14;
		getContentPane().add(EmailField, gbc_EmailField);
		EmailField.setName("E_MAIL");

		PhoneField = new DTextField();
		PhoneField.addActionListener(this);
		ComponentList.add(PhoneField);
		PhoneField.setName("PHONE");
		PhoneField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		PhoneField.setColumns(10);
		GridBagConstraints gbc_PhoneField = new GridBagConstraints();
		gbc_PhoneField.insets = new Insets(0, 0, 5, 0);
		gbc_PhoneField.fill = GridBagConstraints.HORIZONTAL;
		gbc_PhoneField.gridx = 1;
		gbc_PhoneField.gridy = 14;
		getContentPane().add(PhoneField, gbc_PhoneField);

		JLabel lblNewLabel_2_1_1_2_1_2_1 = new JLabel("ADDRESS\r\n");
		lblNewLabel_2_1_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_2_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_2_1_2_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2_1_1_2_1_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_1_2_1_2_1.gridx = 0;
		gbc_lblNewLabel_2_1_1_2_1_2_1.gridy = 15;
		getContentPane().add(lblNewLabel_2_1_1_2_1_2_1, gbc_lblNewLabel_2_1_1_2_1_2_1);

		JLabel lblNewLabel_2_1_1_2_1_2_1_1 = new JLabel("COMENT\r\n");
		lblNewLabel_2_1_1_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_lblNewLabel_2_1_1_2_1_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_2_1_2_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2_1_1_2_1_2_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1_2_1_2_1_1.gridx = 1;
		gbc_lblNewLabel_2_1_1_2_1_2_1_1.gridy = 15;
		getContentPane().add(lblNewLabel_2_1_1_2_1_2_1_1, gbc_lblNewLabel_2_1_1_2_1_2_1_1);

		AddressField = new DTextPane();
		ComponentList.add(AddressField);
		GridBagConstraints gbc_AddressField = new GridBagConstraints();
		gbc_AddressField.insets = new Insets(0, 0, 5, 5);
		gbc_AddressField.fill = GridBagConstraints.BOTH;
		gbc_AddressField.gridx = 0;
		gbc_AddressField.gridy = 16;
		getContentPane().add(AddressField, gbc_AddressField);
		AddressField.setName("ADDRESS");

		CommentBox = new DTextPane();
		ComponentList.add(CommentBox);
		GridBagConstraints gbc_CommentBox = new GridBagConstraints();
		gbc_CommentBox.insets = new Insets(0, 0, 5, 0);
		gbc_CommentBox.fill = GridBagConstraints.BOTH;
		gbc_CommentBox.gridx = 1;
		gbc_CommentBox.gridy = 16;
		getContentPane().add(CommentBox, gbc_CommentBox);
		CommentBox.setName("COMMENT");
		SaveButton = new JButton();
		SaveButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_SaveButton = new GridBagConstraints();
		gbc_SaveButton.fill = GridBagConstraints.BOTH;
		gbc_SaveButton.insets = new Insets(0, 0, 0, 5);
		gbc_SaveButton.gridx = 0;
		gbc_SaveButton.gridy = 17;
		getContentPane().add(SaveButton, gbc_SaveButton);
		JButton CancelButton = new JButton("CANCEL\r\n");
		CancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		CancelButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_CancelButton = new GridBagConstraints();
		gbc_CancelButton.fill = GridBagConstraints.BOTH;
		gbc_CancelButton.gridx = 1;
		gbc_CancelButton.gridy = 17;
		getContentPane().add(CancelButton, gbc_CancelButton);

	}

	void UpdateTable() {
		try {
			String str=new String("");
			PreparedStatement stmt = mainInintials.con.prepareStatement(
					"UPDATE ACCOUNTMASTER SET ?,?,?,?,?,?,?,?,?,?,?,?,?,?,? WHERE ?");
			stmt.
			System.out.println(str);
				if (stmt.executeUpdate() > 0) {
				NameField.requestFocus();
				JOptionPane.showMessageDialog(null, "Record UPDATED successfully");
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Something Went Wrong");
			}
		} catch (SQLException exception) {
			if (exception.getErrorCode() == 1062) {
				JOptionPane jp = new JOptionPane();
				addKeyListener(new KeyAdapter() {
					public void keyReleased(KeyEvent e) {
						e.consume();
						NameField.requestFocusInWindow();
					}
				});
				jp.showMessageDialog(null, "Alias Name ' " + AliasField.getText() + " ' already exists");
			}
			exception.printStackTrace();
		}
	}

	void InsertTable() {
		try {
			StringBuffer listString = new StringBuffer();
			for (int i = 0; i < ComponentList.size(); i++) {
				listString.append(ComponentList.get(i).getName() + ",");
			}
			listString.deleteCharAt(listString.length() - 1);
			PreparedStatement stmt = mainInintials.con.prepareStatement(
					"INSERT INTO ACCOUNTMASTER(" + listString + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			for (int i = 0; i < ComponentList.size(); i++)
				stmt.setString(i + 1, ComponentList.get(i).get());

			if (stmt.executeUpdate() > 0) {
				NameField.requestFocus();
				JOptionPane.showMessageDialog(null, "Record Inserted successfully");
				for (int i = 0; i < ComponentList.size(); i++)
					ComponentList.get(i).set("");
			} else {
				JOptionPane.showMessageDialog(null, "Something Went Wrong");
			}
		} catch (SQLException exception) {
			if (exception.getErrorCode() == 1062) {
				JOptionPane jp = new JOptionPane();
				addKeyListener(new KeyAdapter() {
					public void keyReleased(KeyEvent e) {
						e.consume();
						NameField.requestFocusInWindow();
					}
				});
				jp.showMessageDialog(null, "Alias Name ' " + AliasField.getText() + " ' already exists");
			}
			exception.printStackTrace();
		}
	}

	@Override
	public void insert() {
		new AccountPanel();
		this.setVisible(true);
		SaveButton.setName("SAVEBUTTON");
		SaveButton.setText("SAVE");
		SaveButton.addActionListener(this);
	}

	@Override
	public void view() {
		{
			for (int i = 0; i < ComponentList.size(); i++) {
				JTextComponent field = (JTextComponent) ComponentList.get(i);
				field.setEditable(false);
			}
			this.setVisible(true);
			try {
				sf = new SearchFrame("ALIAS,NAME", "ACCOUNTMASTER");
				sf.setVisible(true);
			} catch (SQLException exception1) {
				exception1.printStackTrace();
			}
			sf.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosed(WindowEvent e) {
					for (int i = 0; i < ComponentList.size(); i++) {
						JTextComponent field = (JTextComponent) ComponentList.get(i);
						field.setText(sf.get(field.getName()));
					}
				}
			});
		}
	}

	@Override
	public void edit() {
		NameField.removeActionListener(this);
		this.setVisible(true);
		try {
			sf = new SearchFrame("ALIAS,NAME", "ACCOUNTMASTER");
			sf.setVisible(true);
		} catch (SQLException exception1) {
			exception1.printStackTrace();
		}

		sf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				for (int i = 0; i < ComponentList.size(); i++)
					ComponentList.get(i).set(sf.get(ComponentList.get(i).getName()));
			}
		});
		SaveButton.setText("EDIT");
		SaveButton.setName("EDITBUTTON");
		SaveButton.addActionListener(this);
	}

	@Override
	public void delete() {
		new DeleteFrame("ACCOUNTMASTER");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource().getClass().getName());
		switch (e.getSource().getClass().getName()) {

		case "Views.DTextField": {
			DTextField field = (DTextField) e.getSource();
			if (field.getName().equals("PRIORITY")) {
				if (Integer.parseInt(field.getText()) > 10) {
					JOptionPane.showMessageDialog(null, "The value should not be greater than 10");
				}
			}
			if (field.getName().equals("NAME")) {
				if (NameField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "This Field should not be empty");
					NameField.requestFocus();
				} else {
					AliasField.setText(mi.getAliasName(NameField.getText()));
				}
			}
			if (field.getName().equals("ALIAS")) {
				if (NameField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "This Field should not be empty");
					AliasField.requestFocus();
				}
			}
			if (field.getName().equals("SUBGROUP")) {
				try {
					mi.buildTableModel(mi.selectDataTable("ALIAS,NAME", "SUBGROUPMASTER"));
					if (mi.getAliasNameMap().keySet().contains(SubGroupField.getText())) {
						SubGroupField.setText(mi.getAliasNameMap().get(SubGroupField.getText()));
					} else {

						sf = new SearchFrame("ALIAS,NAME", "SUBGROUPMASTER");
						sf.setVisible(true);
						sf.addWindowListener(new WindowAdapter() {
							@Override
							public void windowClosed(WindowEvent e) {
								SubGroupField.setText(sf.get("NAME"));
							}
						});
					}
				} catch (SQLException exception) {
					exception.printStackTrace();
				}
			}
			break;
		}
		case "javax.swing.JButton": {
			JButton button = (JButton) e.getSource();
			if (button.getName().equals("SAVEBUTTON")) {
						if (NameField.getText().isEmpty() || AliasField.getText().isEmpty()
								|| PriorityField.getText().isEmpty() || SubGroupField.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Some of the major fields are Empty");
						} else
							InsertTable();
			}
			if (button.getName().equals("EDITBUTTON")) {
						if (NameField.getText().isEmpty() || AliasField.getText().isEmpty()
								|| PriorityField.getText().isEmpty() || SubGroupField.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Some of the major fields are Empty");
						} else
							UpdateTable();
					}
				
			}
			break;
		}
		}
	public static void main(String[] args) {
		AccountPanel ap = new AccountPanel();
		ap.edit();
	}
}
