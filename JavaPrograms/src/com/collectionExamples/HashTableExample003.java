package com.collectionExamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample003 {

	public static void main(String[] args) {
	
		
		//creating map
		
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		// Adding Key pair value in bucket
		map.put("One", 1);
		
		map.put("Two", 2);
		
		map.put("Three", 3);
		// non thread safe to Thread safe application 
		// creating hashtable from map 
		
		Hashtable<String, Integer> table = new Hashtable<String, Integer>(map);
		
		System.out.println(table);
		
		

	}

}
