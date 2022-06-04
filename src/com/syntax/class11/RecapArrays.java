package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class RecapArrays {

	public static void main(String[] args) {

		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please Enter this size of the array that you want to create");
		int arraySize=inp.nextInt();
		
		
		System.out.println("the size of the array is "+ arraySize);
		int [] integerArray=new int [arraySize];
		
		System.out.println("Please enter "+arraySize+" elements");
		
		for (int i=0; i<integerArray.length; i++) {
			integerArray[i]=inp.nextInt(); 
		}
		
		System.out.println(Arrays.toString(integerArray));
		
		System.out.println("==========================");
		
		int sum=0;
		for (int elements:integerArray) {
			sum+=elements;
		}
		System.out.println("The sum of all elements int he array is " + sum);
		
		inp.close();
		
		
		
	}

}
