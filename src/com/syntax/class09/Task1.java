package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
		
		char[] alphabet=new char[6];
		
		alphabet[0]='A';
		alphabet[1]='B';
		alphabet[2]='C';
		alphabet[3]='D';
		alphabet[4]='E';
		alphabet[5]='F';
		
		System.out.println(alphabet[1]);
		
		
		char[] abc = {'A','B','C','D','E','F'};
		
		System.out.println(abc[1]);
		
		}
	
	
	}


