package com.collectionExamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer>table = new Hashtable<String, Integer>();
		table.put(null, null);
			
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		System.out.println("Map Element"+ map);
		System.out.println("***************");
		map.put("12", 37129);
		
		map.put("LNisha", 37129);
		
		map.put("Test", 37129);
		
		map.put("Texas", 474653);
		
		map.put("Miami", 3713429);
		
		map.put("New York", 37129);
		
		map.put(null, 37129);
		
		map.put("florida", null);
		
		for(Entry<String, Integer> me :map.entrySet()) {
			
			System.out.print(me.getKey()+":");
			
			System.out.println(me.getValue());
			
			
			
		}
	}

}
