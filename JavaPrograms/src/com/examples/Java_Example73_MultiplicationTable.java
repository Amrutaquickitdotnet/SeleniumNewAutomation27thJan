package com.examples;

public class Java_Example73_MultiplicationTable {
//Two Dimensional array
	public static void main(String[] args) {
	
		int[][] table = new int[20][3];
		// filling the array

		for (int i = 0; i < 20; i++) {

			table[i][0] = 3; 
			table[i][1] = i + 1; // 0+1
			table[i][2] = 3 * (i + 1); 

		}

		for (int i = 0; i < 20; i++) {

			System.out.println(table[i][0] + "*" + table[i][1] + "=" + table[i][2]);
		}
	}
}