package com.syntax.class09;

import java.util.Scanner;

public class ArraysAsel {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		// arrays is a container that can store multiple containers
		
		// create an array and specify how many value are in it
		int [] b=new int[4];

		//store arrays
		b[0]=90;
		b[1]=85;
		b[2]=75;
		b[3]=100;
		
		
		//access values from my array
		System.out.println(b[2]);
		System.out.println(b[0]+" "+b[1]);
		
		System.out.println("----------------------------------------");
		
		// we need to create an array of my class mate
		
		String[] classMateName=new String[5];
		
		
		classMateName[0]="Adem";
		classMateName[1]="Rami";
		classMateName[2]="Mumtaz";
		classMateName[3]="Selda";
		classMateName[4]="Duran";
		
		
		
		System.out.println("Pick a random number from 0 to 4!");
		int ClassMate=input.nextInt();
		
		System.out.println(classMateName[ClassMate]);
		
		
		
	}

}
