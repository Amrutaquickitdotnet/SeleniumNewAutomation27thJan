

import java.util.Scanner;

public class Java_Example052 {

	public static void main(String[] args) {
		// Convert temperature either from fahrenheit to celsius 
		// Covert temperature from Celsius to fahrenheit;
		double temperature;
		double result;
		char options;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your options ");
		System.out.println("a: Tempearature in fahrenheit: ");
		System.out.println("b: Tempearature in celsius: ");
		options = scan.next().toLowerCase().charAt(0);
		switch(options){
		case 'a':
			System.out.println("Enter the value of temperature: ");
			temperature = scan.nextDouble();
			result= (temperature-32)*5/9;
			System.out.println("The temperature in celsius is :"+ result);
			break;
		case 'b':
			System.out.println("Enter the value of temperature: ");
			temperature = scan.nextDouble();
			result= (temperature*9/5)+32 ;
			System.out.println("The temperature in fahrenheit is :"+ result);
			break;
		default:
			System.out.println("User enter wrong options. \n The Program will terminate");
			System.exit(0);
			
		
		}// end of switch
		
		scan.close();
		

	}// end of main

}// end of class
