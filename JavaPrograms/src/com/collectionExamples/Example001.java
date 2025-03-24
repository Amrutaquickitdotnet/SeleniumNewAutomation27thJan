package com.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Example001 {

	public static void main(String[] args) {
		
		
		List<Integer>list1 = new ArrayList<Integer>();
		
		//FIFO
		//Adding element 
		list1.add(123);//0
		list1.add(1234);//1
		list1.add(12345);//2
		list1.add(123);//3
		list1.add(123456);//4
		list1.add(1234567);//5
		
		// Accessing Element 
		
		
	Iterator itr =	list1.iterator();
	
	//traversing list through iterator
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
		
		

	}

}
