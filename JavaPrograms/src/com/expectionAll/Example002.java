package com.expectionAll;

import java.io.IOException;
import java.util.Scanner;

public class Example002 {

	public static void main(String[] args) throws Exception {
		int totalBalance = 3000;

      
       System.out.println("Please enter money to withdraw");
       Scanner s = new Scanner(System.in);
      int withdrawMoney =s.nextInt();
        if(totalBalance<withdrawMoney) {
        	
        	// Whenever you would like to explain your own exception which can be handled by throw keyword 
        	throw new Exception("Sorry you can not withdraw money as balance is low");
        	
        	
        }
	}

}
