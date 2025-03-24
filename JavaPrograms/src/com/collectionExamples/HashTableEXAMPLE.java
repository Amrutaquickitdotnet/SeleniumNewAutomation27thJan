package com.collectionExamples;

import java.util.Hashtable;

public class HashTableEXAMPLE {

	public static void main(String[] args) {
	
	int initialCapacity = 20;
	
	float loadFactor = 0.5f;
	
	
	Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>(initialCapacity, loadFactor);
	
	System.out.println(hashtable);
	
}
	
}
