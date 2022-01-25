package CheckCodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class checkingTerator {
checkingTerator(HashMap<String,String> hk)
{
	String nameOfTable="";
	String columnNames = "", valuesInText = "";
	System.out.println(hk.keySet());
	for (String string : hk.keySet()) {
		columnNames = columnNames + string.concat(" ");
	}
	columnNames=(columnNames.trim().replace(" ", ","));
	String str = new String("");
	Iterator<String> itr = hk.values().iterator();
	do
	{
		str = str + itr.next();
		str=str+" , ";
		System.out.println(str);
	}while(itr.hasNext());
	
	
	StringBuffer sb = new StringBuffer(str);
	sb.deleteCharAt(sb.length()-3);
			String name=("INSERT INTO " + nameOfTable + "  (" + columnNames + " )" + " VALUES (" + sb + ")");
			System.out.println(name);
}	
public static void main(String[] args)
{
	HashMap<String,String>hk = new HashMap<String,String>();
	hk.put("1","Deepanshu");
	hk.put("2","Manish");
	hk.put("3","Manpreet");
	hk.put("4","Goldi");
	new checkingTerator(hk);
}
}
