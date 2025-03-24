package com.collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
NavigableSet<String>ts = new TreeSet<String>();

ts.add("We");
ts.add("are");
ts.add("testing");
ts.add("tree");
ts.add("set");
System.out.println(ts);

ts.remove("set");

System.out.println(ts);

//remove first element 


ts.pollFirst();

System.out.println("REsult after removing first element "+ts);

ts.pollLast();
System.out.println("Result after removing last element "+ts);




}
}