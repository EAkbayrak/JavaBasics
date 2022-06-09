package com.syntax.class14;

public class AlphaNumberical {

	public static void main(String[] args) {
		
		/*
		 * create a String that should be combination of letters,
		 * 	numbers and special characters. Fin out how many Alphanumerical
		 * 	characters are there in the String
		 */
	
		
		
		String random="efaefeaef123532!£%$^%";
		
		System.out.println(random.replaceAll("[^a-zA-Z0-9]", "").length());

	}

}
