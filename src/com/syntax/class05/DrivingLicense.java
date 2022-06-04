package com.syntax.class05;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		
		
		//You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("You will get a full drivers license");
			
		}else System.out.println("You can apply for a learner permit");
		
		// TODO Auto-generated method stub

	}

}
