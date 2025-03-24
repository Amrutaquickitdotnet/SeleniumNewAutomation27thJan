package com.collectionExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample2 {

	public static void main(String[] args) {
//		Key: String
//		Value : 

		Map<String, String> map = new HashMap<String, String>();
//		map.put("xpath", "//input[@name='username']");
//
//		map.put("LastName", "Pallavi");

		Map<String, Integer> map2 = new HashMap<String, Integer>();

//		map2.put("RollNumber", 23);
//
//		map2.put("Salary", 45);
		
		map2.put(null, null);
		
		
		map2.put("Test", 67);
		
		map2.replace("Test", 123, 67);
		
		map2.replace("Test12", 56);
		
		
		
		map2.put("12", null);
		
		map2.put(" ", null);
		
		map2.put("?", null);

		for (Entry<String, String> me1 : map.entrySet()) {

			System.out.print(me1.getKey() + ":");

			System.out.println(me1.getValue());

		}
		for (Entry<String, Integer> me2 : map2.entrySet()) {

			System.out.print(me2.getKey() + ":");

			System.out.println(me2.getValue());

		}

	}

}
