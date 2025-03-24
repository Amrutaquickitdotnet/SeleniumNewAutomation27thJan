package com.collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;

public class SetCreationExampleLinkedHashSet {

	public static void main(String[] args) {

//Size is bigger than hashset 
		
		// 
		
		//NavigableSet<String>b = (NavigableSet<String>) new HashSet<String>();
		Set<String>a  = new LinkedHashSet<String>();
		//Adding element
		a.add("Nisha");//0
		
		a.add("Pranali");//1
		
		a.add("Mishika");//2
		a.add("Pranjal");//3
		a.add("Aruna");//4
		
		a.add("Nisha");//5
		
		a.add(null);
		a.add(null);//LIFO
		
		for(String allElements:a) {
			System.out.println(allElements);
			
		}
		System.out.println("*********************");
	//Traversing through iteration	
	Iterator<String> i =  	a.iterator();
	
	while(i.hasNext()) {
		
		System.out.println(i.next());
	}
		String check = "Aruna";
		
		System.out.println(a);
		
		a.remove("Pranjal");
		
	
		
		//a.removeAll(a);
		
		System.out.println("After removing pranjal "+a);
		
		
		System.out.println(a.contains(check));
	}

}
