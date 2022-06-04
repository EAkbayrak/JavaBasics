package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		/*
		 * lets ask a user where he is from?
		 */
		
		/*
		 * no boolean, double, no logical operator 
		 * 
		 * Only String, char and int works
		 */
		
		Scanner scan = new Scanner(System.in);
		String country, favouriteFood;

		System.out.println("Where you from?");

		country = scan.nextLine();

		switch (country) {

		case "Mexico":
			favouriteFood = "tacos";
			break;
		case "Turkey":
			favouriteFood = "Lahmacun";
			break;
		case "England":
			favouriteFood = "Fish and Chips";
			break;
		case "Afghanistan":
			favouriteFood = "Pilao";
			break;
		default:
			favouriteFood = "unknown";
		}
			System.out.println("You are from"+country+ " and your favourite food is "+favouriteFood);
	}

}
