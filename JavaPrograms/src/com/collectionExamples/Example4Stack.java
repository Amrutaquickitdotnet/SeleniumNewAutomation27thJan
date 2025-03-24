package com.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Example4Stack {

	public static void main(String[] args) {
		
		
		Stack<String>stack = new Stack<String>();
		
		//LIFO
		//Adding element 
		stack.push("Ayush");
		
		stack.push("Amit");
		
		stack.push("Garima");
		
		stack.pop();
		
	Iterator itr =	stack.iterator();
	
	//traversing list through iterator
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
		
		

	}

}
