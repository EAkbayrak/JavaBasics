package com.syntax.class05;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? If balance of the card is larger than 1000, 
		 * tell them to pay off immediately, otherwise you can tell them that they can spend more.
		 */

		Scanner input=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		boolean yes=input.nextBoolean();
		
		
		if (yes==false) {System.out.println("Would you like a credit card?");}
			else 
				if (yes==true) ;
		
					System.out.println("What is the balance on your credit card");		
					Double balance=input.nextDouble();
		
				if (balance>=1000) { System.out.println("You need to pay off your debt");
				} else System.out.println("Spend more");
		
		
	}

}
