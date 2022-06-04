package com.syntax.class09;

public class HW3DoubleNumbers {

	public static void main(String[] args) {

		/*
		 * Create an array to store double values 
		 * then print all elements using 2 different loops 
		 */
		
		double [] doubles = {2.5,2.1,5.5,6.5,7.2}; 
		
		for (int a = 0; a < doubles.length; a++) {
			System.out.print(doubles[a]+" ");
		}
		System.out.println("   ");
		
		int doubleList=0;
		while (doubleList < doubles.length) {
			System.out.println(doubles[doubleList]);
			doubleList++;
		}
		
		
		
	}

}
