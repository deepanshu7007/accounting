package Views;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import accountingproject.mainInintials;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class SearchFrame extends JFrame {
	private JTable table;
	private String value;
	private Map<String,String> ColumnValues;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public String get(String values)
	{
		return ColumnValues.get(values);
	}
	public SearchFrame(String columnNames,String tableName) throws SQLException {
		
		ColumnValues = new HashMap<String,String>();
		
		 setTitle("Search");
		Statement stmt=mainInintials.con.createStatement();
		ResultSet rs = stmt.executeQuery("Select "+columnNames+" from "+tableName);
		DefaultTableModel model = new mainInintials.MainTools().buildTableModel(rs);
		table= new JTable(model) {
	    	public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
	         }
	    };
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = table.getValueAt(table.getSelectedRow(),1).toString();
    			try {
					Statement stmt=mainInintials.con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT "+columnNames+" FROM "+tableName+" WHERE ALIAS='"+value+"'");
					ResultSetMetaData meta = rs.getMetaData();
					while(rs.next())
					{
						for(int i=1;i<=meta.getColumnCount();i++)
						{
							String key = meta.getColumnName(i);
							String value = rs.getString(key);
							ColumnValues.put(key,value);
						}
					}
					System.out.println(ColumnValues);
				} catch (SQLException exception) {
					// TODO Auto-generated catch-block stub.
					exception.printStackTrace();
				}
    			
    			 dispose();
			}
		});
	    table.setRowHeight(25);
	    table.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
	    table.setRowSorter(sorter);
	    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    JScrollPane pane = new JScrollPane(table);
	     getContentPane().add(pane, BorderLayout.CENTER);
	   
	    JPanel panel = new JPanel(new BorderLayout());
	    final JTextField filterText = new JTextField();
	    filterText.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    panel.add(filterText, BorderLayout.CENTER);
	     getContentPane().add(panel, BorderLayout.NORTH);
	    
	   JLabel rdbtnNewRadioButton = new JLabel("Search");
	    rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
	    panel.add(rdbtnNewRadioButton, BorderLayout.NORTH);
	    filterText.requestFocusInWindow();
	    filterText.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == KeyEvent.VK_ENTER &&  filterText.getText().isEmpty())
			{
				table.requestFocus();
			}
			if(e.getKeyChar() == KeyEvent.VK_ENTER)
			{
				table.requestFocus();
				table.setRowSelectionInterval(0, 0);
			}	
			String text = filterText.getText();
	        if (text.length() == 0) {
	          sorter.setRowFilter(null);
	        } else {
	          sorter.setRowFilter(RowFilter.regexFilter("^"+text));
	        }
		}
	    	
	    });
	    table.addKeyListener(new KeyAdapter() {
	    	@Override
			public void keyPressed(KeyEvent e)
	    	{
	    		if(e.getKeyChar()== KeyEvent.VK_ENTER)
	    		{
	    			value = table.getValueAt(table.getSelectedRow(),0).toString();
	    			System.out.println(value);
	    			try {
						ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableName+" WHERE ALIAS='"+value+"'");
						ResultSetMetaData meta = rs.getMetaData();
						while(rs.next())
						{
							for(int i=1;i<=meta.getColumnCount();i++)
							{
								String key = meta.getColumnName(i);
								String value = rs.getString(key);
								ColumnValues.put(key,value);
							}
						}
						System.out.println(ColumnValues);
					} catch (SQLException exception) {
						// TODO Auto-generated catch-block stub.
						exception.printStackTrace();
					}
	    			 dispose();
	    		}
	    	}
	    });
	    table.setRowSelectionInterval(0, 0);
	     setSize(1067, 885);
	   
	}

}
