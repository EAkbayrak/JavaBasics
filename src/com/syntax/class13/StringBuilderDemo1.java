     package com.syntax.class13;

import java.util.Scanner;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		
		   Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();
		   	//write your code below


		    //A palindrome means that the characters are the same forwards and backwards, ignoring spaces.

		    char []  parra = new char [givenString.length()];
		    int b = 0;
		    for (int a = givenString.length()-1; a>=0; a--) {
		      
		      parra[b]=givenString.charAt(a);
		      b++;
		    }

		      for(int c = 0; c<parra.length; c++){
       
		        
		      }

	
	
	
	}

}
