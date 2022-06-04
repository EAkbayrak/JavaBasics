package com.syntax.Class07;

import java.math.MathContext;
import java.util.Scanner;

public class AzmBalance {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		/*
		 * Write a program that works out number of years it will take them to reach £50,000 
		 * if they have an initial balance of £10,000 and they earn compound interest of 15% every year.
		 */
		
		double balance=10000;
		int years=0;
		
		do {
			
			years++;
			balance=((balance*0.15)+balance);
		} while (balance<=50000);
			
			
		
			
			System.out.println(balance);
			
			
			
			
		}}
		
			
		
		
		
		
		
		
		
	


