package com.syntax.Class07;

import java.util.Scanner;

public class AzmZimbabwe {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		String location;
		
		do {
			System.out.println("What is the capital of Turkey?");
		 location=input.next();
		 
		}while (!location.equals("Ankara"));
			
		 System.out.println("Good");
		
		
		

	}

}
