package com.syntax.class05;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
	System.out.println("Enter a number for the day");
	
	int day=input.nextInt();
	
	if (day>=1 && day<=5) System.out.println("Its the weekday");
	else if (day>=6 && day<=7)  System.out.println("Its the weekend");
	else System.out.println("You have entered an invalid day");
	
	
		
		// TODO Auto-generated method stub

	}

}
