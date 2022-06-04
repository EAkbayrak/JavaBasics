package com.syntax.class04;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		//Creating a scanner
		Scanner input=new Scanner(System.in);
		
		//send instruction to the console
		System.out.println("Please enter your name ");
		
		//We need to grab the value from console
		String name=input.next();
		System.out.println(name);

		//ket's send instruction
		System.out.println(name +" please enter your age");
		
		//need to capture and store age
		int age=input.nextInt();
		
		System.out.println(name+" is "+age+" years old");
		
		// TODO Auto-generated method stub

	}

}
