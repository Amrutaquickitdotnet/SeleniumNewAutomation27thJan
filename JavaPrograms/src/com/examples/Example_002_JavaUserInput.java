package com.examples;

import java.util.Scanner;

public class Example_002_JavaUserInput

{

	public static void main(String[] args) 
	{
		
		
		
		// Scanner class ==> is used to get user input and it is found under java.util package 
		
		Scanner  myObj = new Scanner(System.in);// Scanner class is ready to load user input 
				
				System.out.println("Enter username");
			String username =	myObj.nextLine();
			System.out.println("username is "+ username);
			
			
			//Numerical Input 
			
            int age =      myObj.nextInt();
            
            System.out.println("Age :" + age);
            
          double salary =  myObj.nextDouble();
          System.out.println("Salary"+ salary);
          
//				myObj.nextFloat();
				
				
		myObj.close();
	}
	
	// Assignment ==> 1  --Coffee
	// 2===> Hot Coffee
	// 3 ===> Soda
	
	
	
	}

