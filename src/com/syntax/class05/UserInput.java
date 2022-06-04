package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name = input.next();
		System.out.println(name);
		
		System.out.println("Please enter name");
		String fullName = input.next();
		System.out.println(fullName);

		System.out.println("Please enter your age");
		int age = input.nextInt();
		System.out.println(age);

		System.out.println("Please enter your price");
		double price = input.nextDouble();
		System.out.println(price);
		
		System.out.println("please enter boolean");
		boolean boo = input.nextBoolean();
		System.out.println(boo);
		
		
		System.out.println("please enter a character");
		char character=input.next().charAt(5);
		System.out.println(character);

	}

}
