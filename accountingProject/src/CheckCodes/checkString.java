package CheckCodes;

import java.util.ArrayList;

public class checkString {
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");

		StringBuilder sb = new StringBuilder();
		for (String s : list)
		{
		    sb.append(s);
		    sb.append(",");
		}
		sb.deleteCharAt(sb.length()-1);
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("one");
//		list.add("two");
//		list.add("three");
//
//		String listString = "";
//
//		for (String s : list)
//		{
//		    listString += s + ",";
//		}
//		
		System.out.println(sb);

	
		
	}
}
