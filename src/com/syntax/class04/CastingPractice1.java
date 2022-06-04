package com.syntax.class04;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Whats your first name?");
		String firstName=input.next();
		System.out.println(firstName+" is your first name and what is your last name?");
		String surname=input.next();
		
		System.out.println("Your full name is, "+firstName+" emr"+surname+" and how old are you?");
		int age=input.nextInt();
		System.out.println("Your full name is "+firstName+surname+" and you are "+age+" years old;");
		
		// TODO Auto-generated method stub

	}

}
