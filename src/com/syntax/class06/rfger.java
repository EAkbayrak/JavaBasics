package com.syntax.class06;

public class rfger {
	public static void main(String[] args) {


		//even and odd 1 to 70
		
		int oddSum=0;
		int evenSum=0;
		
		for (int a=1; a < 70; a++) {
			
			if (a%2==0) {
				evenSum+=a;
			}else if (a%2!=0) {
				oddSum+=a;
			}
			
			
		}System.out.println("The sum of all even number are " +evenSum);
		System.out.println("The sum of all odd numbers are " +oddSum);
     }
}


/*
 * }if(country.equalsIgnoreCase("Nigeria")) {
					System.out.println("The capital of "+country+" is Abuja");
				}if(country.equalsIgnoreCase("Ukraine")) {
					System.out.println("Kyiv");
				}if(country.equalsIgnoreCase("Azerbaijan")) {
					System.out.println("Baku");
 */

