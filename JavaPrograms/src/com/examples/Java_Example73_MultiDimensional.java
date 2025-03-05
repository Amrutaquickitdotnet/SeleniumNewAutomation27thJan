package com.examples;

public class Java_Example73_MultiDimensional {
//Two Dimensional array
	public static void main(String[] args) {
		int[][] arr = new int[2][6];
		// Number of rows
		System.out.println("Rows" + arr.length); // RowCount
		// Number of columns

		System.out.println("columns" + arr[0].length);

		String[][] stars = { { "*", "*", "*" }, { "*", "*", "*" }, { "*", "*", "*" } };

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(stars[i][j] + " ");

			}

			System.out.println();
		}
		
		
		String[][] numbers = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "9", "4" } };

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(numbers[i][j] + " ");

			}

			System.out.println();
		}

	}
}