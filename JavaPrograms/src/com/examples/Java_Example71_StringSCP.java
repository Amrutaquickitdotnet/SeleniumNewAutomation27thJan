package com.examples;

public class Java_Example71_StringSCP {

	public static void main(String[] args) {
		
//		
//		String s ="level";
//	boolean	res =isPlainDrome(s);
//	
//	if (res) {
//		System.out.println("this is plaindrome");
//	}else {
//		
//		System.out.println("Not a plaindrome");
//	}
//		
//		String str4 = new String("John");//Object String //2   Heap  and other is on SCP
//		
//		String str5 = new String("doe");
//	
//	    String str3 = "Hello";
//	
//		System.out.println(str4);
//		System.out.println(str5);
//		System.out.println(str3);
//		
//		System.out.println("String manipulation in java");
//		
//		String greet = "HOW ARE YOU";
//		String answer = "I am FIne";
//		
//		System.out.println("The lower case :"+ greet.toLowerCase());// to convert my case sensitivity of string
//		System.out.println("The capital letter case"+ answer.toUpperCase());
//			
//		System.out.println("Length of string is"+ greet.length());
//		
//		System.out.println("Retrieve poisition of desired character: "+greet.charAt(6) );
		
		//  to insert a string into another string 
		
		
//		String str6 = "I am learning";
//		
//		String strtoBeInserted = "Selenium";
//		
//		
//		System.out.println(str6.concat(strtoBeInserted));
//		
//		// 3. Split ==> I would like to seperate some characters from String 
//		
//		
//		String date = "07-Feb-2025";
//		
//		// 07 Feb 2025
//		
//	String[] datecalc=	date.split("-");
//	System.out.println("Day of the year:"+" "+ datecalc[0]);
//	System.out.println("Month of the year:"+" "+ datecalc[1]);
//	System.out.println("year is:"+""+ datecalc[2]);
//	
//	String str8 = "WEATHER IS SUNNY AND BRIGHT";
//	String str9 = "Weather is sunny and bright";
//	
//	if(str8.equalsIgnoreCase(str9)) {
//		System.out.println("String match");
//		
//	}else {
//		System.out.println("String does not match");
//	}
//	
//	String str10= "    Learning is Fun       ";
//	// print string without space 
//	
//	System.out.println("String before trimming space"+ str10);
//	
//	
//	System.out.println("String after trimming space"+ str10.trim());
//		
//	
//	//substring(int startIndex)==> returns a new string that begins at the specified StartIndex and extends to the end of the original string
//		
//		String str11 = "Hello, World!";
//		System.out.println(str11.substring(7));//
//		System.out.println(str11.substring(0, 8));//(5-1)
//		// indexOf method ==> index of first occurance
//		String str12 = "Java is fun";
//		int result;
//		
//		result = str12.indexOf('s');
//		System.out.println(result);
		
		String str13 = "Learn Java";
		
		// njava  0 1 2 3 4
		//System.out.println(str13.indexOf('j'));
		//System.out.println(str13.indexOf("ava"));
		//System.out.println(str13.indexOf("java"));
		//System.out.println(str13.indexOf("Le"));
		//System.out.println(str13.indexOf('a',4));
		//System.out.println(str13.indexOf("Java", 8));
		
		
		//lastIndexOf()
		//ch ==> , index 
		
		//System.out.println(str13.lastIndexOf("a"));
		//System.out.println(str13.indexOf("java"));
		//System.out.println(str13.lastIndexOf('n', 9));
		
		
		String str14 = "I am learing Selenium with java";
//		System.out.println(str14.contains("Selenium"));
//		System.out.println(str14.contains("Java"));
//		
		System.out.println(str14.endsWith("a"));
		
		System.out.println(str14.startsWith("P"));
		
		System.out.println(str14.startsWith("I"));
		
		//Assignment How to Reverse string 
		
		// first step would be  case sensitivity of string 
		
		// Use for loop to iterate String with reverse()
		
		
		

}
	// write program to check whether string is a plaindrome
	
	
	public static boolean isPlainDrome(String s) {
		
		s.toLowerCase();// convert to lowercase
		//reverse the string
		
		// 1 2 3 4 5
		
		// Descending Order 5,4,3
		
		// String s = "Nisha";  0 1 2 3 4
		
		//4 3 2 1
		
		String reverse ="";
		for(int i= s.length()-1; i>=0; i--) {
			
			
		reverse =	reverse+ s.charAt(i);
		}
		
		// compare the string 
		// 4 3 2 1 
		
		
		// equals is method used in string manipulation which help me out to read my whole string in strickly case sensitive factor 
		
		return s.equals(reverse);
		
		
	}
	
}