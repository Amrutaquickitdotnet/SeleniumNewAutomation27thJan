package com.examples;

public class Java_Example72_ArraysinJava {

	public static void main(String[] args) {
		// Arrays : is a container which hold homogenous data type.

		int[] numbers = { 11, 12, 13, 14,15 };//Array declaration
		
		int[] sort = new int[5];// Declaration of arrays; 4 
		sort[0]=100;
		

// It is container which hold homogeneous data type 

		System.out.println("Index position 0:" + numbers[0]);// accessing of array
		System.out.println("Index position 1:" + numbers[1]);
		System.out.println("Index position 2:" + numbers[2]);
		System.out.println("Index position 3:" + numbers[3]);
		System.out.println("*******************************");
		
		System.out.println("Index position 0:" + sort[0]);// accessing of array
		
		System.out.println("**********************");


		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Arrays inside the container:" + numbers[i]);
		}

		System.out.println("*********************************");
		String[] names = { "Nisha", "Tanuja", "Priyanka" };
		for (int i = 0; i < names.length; i++) {

			System.out.println("names inside the container:" + names[i]);
		}

	}

}