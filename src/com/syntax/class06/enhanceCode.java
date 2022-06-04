package com.syntax.class06;

import java.util.Scanner;

public class enhanceCode {


		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//switch does not allow to have multiple duplicate cases

		char choice='f';
		String meaning;
		switch(choice) {
		
		case 'Y':
				meaning="Yes";
				break;
		case 'M':
				meaning="Maybe";
				break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="unknown";	
		}
		
		
		System.out.println(choice);
		
		
		
		
		}}