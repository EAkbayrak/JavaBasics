package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		
		String [] cars= {"togg","Nissan","Toyota","BMW","Merc","Tesla"};
		
		for(int a=0; a < cars.length; a++) {
			
			System.out.print(cars[a] + " ");
		}
		
		String [] araba = new String[6];
		araba [0] ="togg";
		araba [1] ="bmw";
		araba [2] ="Toyota";
		araba [3] ="Bentley";
		araba [4] ="VW";
		araba [5] ="Ford";
		
		int carNumbers=0;
		while (carNumbers <araba.length) {
			System.out.println(araba[carNumbers]);
			carNumbers++;
		}
		
		
	}

}
