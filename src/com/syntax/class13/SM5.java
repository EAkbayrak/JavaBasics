package com.syntax.class13;

public class SM5 {

	public static void main(String[] args) {
		
		String str="efwASDAAfweWSDWQfwef3515361641?{}P@{P@";
		
		
		System.out.println(str.replace("3", "_"));
		
		// How to only extract numbers or lowercase letters or symbols
		System.out.println(str.replaceAll("[0-9]", "#"));
		// out put efwfewfwefwef##########?{}P@{P@
		
		System.out.println(str.replaceAll("[A-Za-z, 0-9]", "#"));
		
		// replace everything but "^" a-z
		System.out.println(str.replaceAll("[^a-z]", "_"));
		
		// I only want to replace the special characters
		
		
		// how to remove all special characters
		System.out.println(str.replaceAll("[^A-z, 0-9]", ""));
		
	}

}
