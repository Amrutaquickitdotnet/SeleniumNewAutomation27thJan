package com.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Example3vector {

	public static void main(String[] args) {
		
		
		Vector<String>vect = new Vector<String>();
		
		//FIFO
		//Adding element 
		vect.add("Nisha");//0
		vect.add("Kavita");//1
		vect.add("ritu");//2
		vect.add("tanuja");
		
		// Accessing Element 
		
		for(String all:vect) {
			System.out.println(all);
			
			
		}
		System.out.println("****************");
	Iterator itr =	vect.iterator();
	
	//traversing list through iterator
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
		
		

	}

}
