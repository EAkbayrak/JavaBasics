package com.syntax.class13;

public class StringManipulation2 {

	public static void main(String[] args) {

			String str="Where is sameer?";
			// A string is the same as an array of characters
			
			
			// how to find the value is of a specific character index of a String Value
			System.out.println(str.charAt(0));
			
			// how to find the first char/string array index of a string value
			System.out.println(str.indexOf("e"));
			
			//how to find the second char/String array index of a string value
			System.out.println(str.indexOf("e", 3/* starting from the index */));
			
			int second=str.indexOf("e");
			
			System.out.println(str.indexOf("e", second+1));

			
			
			
	}

}
