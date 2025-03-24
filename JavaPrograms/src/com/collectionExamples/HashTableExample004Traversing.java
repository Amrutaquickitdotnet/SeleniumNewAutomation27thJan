package com.collectionExamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample004Traversing {

	public static void main(String[] args) {
	
		
		
		Hashtable<Integer, String>  table = new Hashtable<Integer, String>();
		table.put(100, "Nisha");//0
		
		table.put(200, "Nisha");//1
		
		table.put(100, "Nisha");//2
		
		table.put(400, "Nisha3");//3
		
		table.remove(400);
		
		table.putIfAbsent(700, "Priyanka");
		
	//System.out.println(table.getOrDefault(100,"Not Found"));// Nisha
		
		//System.out.println(table.getOrDefault(800,"Not Found"));
		
// iterating element 
		
		
	for(Map.Entry m :table.entrySet()){
		
		System.out.println("Print the key of hashtable"+":"+m.getKey());
		System.out.println("Print the value of hashtable"+":"+m.getValue());
		System.out.println("Print the key and value of hashtable"+":"+m.getKey()+":"+ m.getValue());
		
		
	}
	}

}
