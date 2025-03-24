package com.collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCreationExample002 {

	public static void main(String[] args) {


		Set<String>a  = new HashSet<String>();
		
		a.add("Nisha");//0
		
		a.add("Pranali");//1
		
		a.add("Mishika");//2
		a.add("Pranjal");//3
		a.add("Aruna");//4
		
		for(String allElements:a) {
			System.out.println(allElements);
			
		}
		System.out.println("*********************");
		
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
