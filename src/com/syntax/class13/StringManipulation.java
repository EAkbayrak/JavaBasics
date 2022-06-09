package com.syntax.class13;

class StringManipulation {
	
	    //String class is used to store and manipulate character based data alphabets and special characters
			
		// String str= new String("Hold your horse");
		//(String = DataType
		// str => variable name/ object /instance
		// =  => assignment operator. it stores the right right side to the left
		// new => is used to create Objects
		// String(Constructor);  its also like a method it contains some java statements 
		// which are executed when object of this class is created

	
	public static void main(String[] args) {
		
	
		String str="Batch 13 is great but i say this to every batch. I was kidding";
		
		//to calculate the sum of characters in the line
		int len=str.length();
		
		// how to make everything upper case
		System.out.println(str.toUpperCase());
		String upCase=str.toUpperCase();
		
		//how to make everything lower case
		System.out.println(str.toLowerCase());
		String lowerCase = str.toLowerCase();
		
		// you can also reassign the str value to change to upper case or lower case
		str = str.toUpperCase();
		
		// to check if a value of a variable is empty
		System.out.println(str.isEmpty()); //boolean
		 
		// to check if a value of a variable is Empty including spaces
		System.out.println();
		
		String str2="  I Love Java  ";
		
		// How to remove the spaces before the first part of the value and the end of a variable
		System.out.println(str2.trim());
		
		// How to look check if a word is within a value of a string variable
		System.out.println(str.toLowerCase().contains("great"));
		
		//how to check if a word/character is the starting word or char is of the value
		System.out.println(str.toLowerCase().startsWith("batch"));
		
		//how to check if a word/char ends of a String value
		System.out.println(str.toLowerCase().endsWith("kidding"));
		
		
		
	}
}
