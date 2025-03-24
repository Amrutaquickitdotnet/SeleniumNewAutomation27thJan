package com.collectionExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCreationExample {

	public static void main(String[] args) {


		Set<Integer>a  = new HashSet<Integer>();
		
		
		
		a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
		

		Set<Integer>b = new HashSet<Integer>();
		
		
		
		b.addAll(Arrays.asList(new Integer[] {9,2,3,4,0,8}));
		
		
		Set<Integer>union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Union of the two set"+union);
		
		
		Set<Integer>intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println("Intersetion  of the two set"+intersection);
		
		Set<Integer>difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.println("Difference  of the two set"+difference);	
	}

}
