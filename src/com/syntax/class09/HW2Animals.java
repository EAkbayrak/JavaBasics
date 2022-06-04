package com.syntax.class09;

public class HW2Animals {

	public static void main(String[] args) {
		
		/*
		 * Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */

		String[] animals= {"Bear","Cheetah","Lion","Leapord","whale"};
		
		for (int a=0; a <animals.length; a++) {
			System.out.print(animals[a]+" ");
		}
		System.out.println("  ");
		
		int animalNumber=0;
		while (animalNumber < animals.length) {
			System.out.print(animals[animalNumber] + " ");
			animalNumber++;
		}
		

	}

}
