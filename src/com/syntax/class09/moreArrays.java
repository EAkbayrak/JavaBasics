package com.syntax.class09;


import java.util.Scanner;

public class moreArrays {

	public static void main(String[] args) {
		
	
	
		String [] names = {"Adem", "Selda","Mumtaz", "Oleg","Emre"};
		  int [] ages = {16, 24, 36, 41, 52};
		  
		  		  
		 for (int a = 0; a <=4; a++) {
			
			if (ages[a] < 18) {
				System.out.println("Sorry, " + names[a] + " you are too young to join the club!");
				
			}else if (ages[a] == 18) {
				
				System.out.println("You, " + names[a] + ", are qualified to join the club with basic membership");
				
			}else if (ages[a] > 18) {
				System.out.println("You, " + names[a] + ", are qualified to join the club with gold membership");
			}
			
			
				 
			 }
			 
			 
		 }
		  	
	}


