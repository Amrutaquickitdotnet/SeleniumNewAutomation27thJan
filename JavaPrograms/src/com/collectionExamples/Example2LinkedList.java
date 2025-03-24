package com.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Example2LinkedList {

	public static void main(String[] args) {
		
		
		List<String>list1 = new LinkedList<String>();
		
		//FIFO
		//Adding element 
		list1.add("Red");//0
		list1.add("Yellow");//1
		list1.add("Blue");//2
		list1.add("Blue");
		
		// Accessing Element 
		
		for(String all:list1) {
			System.out.println(all);
			
			
		}
		System.out.println("****************");
	Iterator itr =	list1.iterator();
	
	//traversing list through iterator
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
		
		

	}

}
