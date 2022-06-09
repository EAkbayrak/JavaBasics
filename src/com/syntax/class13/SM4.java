package com.syntax.class13;

import java.util.Scanner;

public class SM4 {

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
		    boolean palindrome=true;

		      for(int c = 0; c<parra.length; c++){

		        if(parra[c] == givenString.charAt(c)) {
		          palindrome=true;
		          
		        }else if (parra[c] != givenString.charAt(c)) {
		        palindrome=false;
		      }}

		    System.out.print(palindrome);

	}

}
