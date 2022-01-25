package accountingproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import java.sql.Statement;

public class mainInintials {
	public static Connection con;

	public mainInintials() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingdatabase", "root", "Anshu12345$");
		} catch (ClassNotFoundException | SQLException exception) {
			exception.printStackTrace();
		}
	}

	public static class MainTools {
		private ResultSet rs;
		private HashMap<String, String> aliasNameMap;

		private ArrayList<String> listOfAlias = new ArrayList<String>();

		public HashMap<String, String> getAliasNameMap() throws SQLException {
			if (aliasNameMap == null) {
				throw new SQLException("PLEASE INITALIZE THE ARRAYLIST");
			} else
				return aliasNameMap;
		}

		ArrayList<String> getAliasList() // to get a list of alias
		{
			Statement stmt;
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(
						"SELECT ALIAS FROM GROUPMASTER UNION SELECT ALIAS FROM ACCOUNTMASTER UNION SELECT ALIAS FROM SUBGROUPMASTER");
				while (rs.next()) {
					listOfAlias.add(rs.getString(1));
				}
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
			return listOfAlias;
		}

		public String getAliasName(String aliasText) // to get an alias name from the entered text from the textfield
		{
			getAliasList();
			int i = 0;
			String nameTemp = "";
			StringTokenizer st;
			do {
				i++;
				nameTemp = "";
				st = new StringTokenizer(aliasText, " ");
				while (st.hasMoreElements()) {
					nameTemp = nameTemp + st.nextToken().substring(0, i);
				}
			} while (listOfAlias.contains(nameTemp));
			return nameTemp;
		}

		public boolean insertIntoTable(String nameOfTable, HashMap<String, String> hk) throws SQLException // to insert
																											// data into
																											// database
																											// from
																											// different
																											// areas
		{
			PreparedStatement stmt;
			if (con.isClosed()) {
				throw new SQLException("The Connection to the database is closed");
			} else {
				String columnNames = "", valuesInText = "";
				System.out.println(hk.keySet());
				for (String string : hk.keySet()) {
					columnNames = columnNames + string.concat(" ");
				}
				System.out.println(columnNames.trim().replace(" ", ","));
				ArrayList<String> str = new ArrayList<>();
				Iterator<String> itr = hk.values().iterator();
				stmt = con.prepareStatement(
						"INSERT INTO " + nameOfTable + "  (" + columnNames + " )" + " VALUES (" + valuesInText + ")");
			}
			if (stmt.executeUpdate() > 0)
				return true;
			else
				return false;
		}

		public ResultSet selectDataTable(String ColumnNames, String TableName) throws SQLException {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT " + ColumnNames + " FROM " + TableName);
			return rs;
		}

		public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
			Vector<Vector<Object>> data;
			Vector<String> columnNames;
			if (!rs.next()) {
				String data1[][] = { {}, {}, {} };
				String column[] = { "ALIAS", "NAME" };
				return new DefaultTableModel(data1, column);
			} else {
				ResultSetMetaData metaData = rs.getMetaData();
				columnNames = new Vector<String>();
				int columnCount = metaData.getColumnCount();
				for (int column = 1; column <= columnCount; column++) {
					columnNames.add(metaData.getColumnName(column));
				}

				aliasNameMap = new HashMap<String, String>();
				rs.first();
				do {
					aliasNameMap.put(rs.getObject(1).toString(), rs.getObject(2).toString());
				} while (rs.next());
				System.out.println(aliasNameMap.size());
				data = new Vector<Vector<Object>>();
				rs.first();
				do {
					Vector<Object> vector = new Vector<Object>();
					for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
						vector.add(rs.getObject(columnIndex));
					}
					data.add(vector);
				} while (rs.next());

			}
			return new DefaultTableModel(data, columnNames);
		}
	}

}
