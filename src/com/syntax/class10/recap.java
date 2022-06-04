package com.syntax.class10;

public class recap {

	public static void main(String[] args) {
		
		// array - container object that consists of values of the same type
		
		String [] disney = { "shrek", "tarzan", "Woody","Mulan"};
		
		for (int i = 0; i<disney.length; i++) {
			
			if (disney[i].equalsIgnoreCase("tarzan")) {
				System.out.println(disney[i]+ " is my favourite character");
			}
		}
		
		// array - is a java data structure
		
		//elements based on idexes. indexes start from 0
		
		// array is fixed in size !
	}

}
