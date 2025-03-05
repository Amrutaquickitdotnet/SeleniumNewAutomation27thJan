package com.examples;

import java.util.Scanner;

public class Java_Example74_PrintTimeTableusingScanner {
//Two Dimensional array
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number:");
		
	int num = 	s.nextInt();
	
	int[][] table = new int[10][3];

		for (int i = 0; i < 10; i++) 
		{

			table[i][0] = num; // This will represent first value of column i.e. taking user input
			table[i][1] = i + 1;// This will represent second column by incrementing by order 1
			table[i][2] = num * (i + 1); // This will represent multiplication result

		}

		for (int i = 0; i < 10; i++) {

			System.out.println(table[i][0] + "*" + table[i][1] + "=" + table[i][2]);
		}
	}
}