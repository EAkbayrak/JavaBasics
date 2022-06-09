package com.syntax.class14;

public class recap {

	public static void main(String[] args) {

		String str="I never forget about recording ";

		System.out.println(str.replace("never", "always")); // to replace a word or char
		
		
		// method chaining is when you add two methods on the same line
		System.out.println(str.replace("never", "").replace("always", ""));	
	
		
		String str2 = "Batch 13 is Great.Batch 13 is best.Batch 13 is excellent";  
		
		String [] str2Array=str2.split("[.]");  
		
		System.out.println(str2Array[0].trim());
		System.out.println(str2Array[1].trim());
		System.out.println(str2Array[2].trim());
		
	}

}
