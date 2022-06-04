package com.syntax.class04;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("What year were you born in?");
		int year=input.nextInt();
		int calculator=2022-year;
		
		
		if (year>2022) {System.out.println("Please enter a correct year");}
		else {System.out.println("You are "+calculator+" years old");}
				
	//
		
		
		
		// TODO Auto-generated method stub

	}

}
