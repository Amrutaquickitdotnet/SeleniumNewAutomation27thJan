

import java.util.Hashtable;

public class Java_Example070 {

	public static void main(String[] args) {
		// put hashtable inside hashtable
		Hashtable< String, String> table1 = new Hashtable<String , String>();
		table1.put("name1", "Afridi");
		table1.put("name2", "Sachin");
		table1.put("name3", "Lara");
		System.out.println(table1);
		
		Hashtable< String, String> table2 = new Hashtable<String , String>();
		table2.put("city1", "Africa");
		table2.put("city2", "Japan");
		table2.put("city3", "Hongkong");
		System.out.println(table2);
		
		
		Hashtable<String, Hashtable<String, String>> table = new Hashtable<String, Hashtable<String, String>>();
		table.put("name", table1);
		table.put("Place", table2);
		//System.out.println(table);
		System.out.println(table.get("name").get("name2"));
		System.out.println(table.get("Place").get("city3"));
	}

}
