package com.collectionExamples;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Books {
	// data members
	int id;

	String name, author, publisher;
	int quantity;

	public Books(int id, String name, String author, String publisher, int quantity) {

		this.id = id;

		this.name = name;
		this.author = author;
		this.publisher = publisher;

		this.quantity = quantity;

	}

	public static void main(String[] args) {
		Map<Integer, Books> table = new Hashtable<Integer, Books>();

		// creating books

		Books b1 = new Books(101, "Learn Programming", "Mc graw Hill", "Gavlin", 10);

		Books b2 = new Books(102, "Ramayan", "Vyas", "xyz", 4);

		Books b3 = new Books(103, "Data Structure", "Steev job", "O'reily", 10);

		// adding books table

		table.put(1, b1);
		table.put(2, b2);
		table.put(3, b3);

		// traversing table

		for (Map.Entry<Integer, Books> booklist : table.entrySet())

		{
			int key = booklist.getKey();

			Books b = booklist.getValue();
			
			System.out.println(key+ ":"+ "Adventures");
			
			System.out.println(b.id+" "+ b.name+ " "+ b.author+" "+ b.publisher+ " "+ b.quantity);

		}

	}

}
