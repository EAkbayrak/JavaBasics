package com.syntax.class13;

public class StringManipulation3 {

	public static void main(String[] args) {
			
		String str="I am confused, like #really really confused#";
		
		int first = str.indexOf("#");
		int first1 = first+1;
		
		int second = str.indexOf("#",str.indexOf("#")+1 );
		
		System.out.println(first);
		System.out.println(second);
		
		System.out.println(str.substring(first1, second));
		 
		
		
				
		for (int x=first+1; x<second; x++) {
			System.out.print(str.charAt(x));
		}
		
	}

}
