package com.syntax.class12;

public class StringDemo1 {
	
	String name =new String("Emre"); //proper way of creating an object from a class
	
	String name1="Emre"; // its same as String name=String ("emre";
	
	//all the classes in java can be treated as data types
	
	

	public static void main(String[] args) { 

		String firstName = "Adem";
		String lastName  = "Jones";
		String fullName  = firstName+lastName;
		String fullName1 = firstName.concat(lastName); //Never use this because it can lead to NullPointer exception 

		String name = "";
		System.out.println(name); //Only true if there's no characters including spaces
		System.out.println(name); // Only true if there's no characters excluding spaces

		if(name.isEmpty()) {
			System.out.println("Name needs to be filled out");
		}
				
		
		
	}

}
